package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;

import org.json.JSONObject;

import java.util.Arrays;


public class LoginActivity extends AppCompatActivity {
    private Button btn;
    private Button logout;
    private CallbackManager callbackManager;
    private AccessTokenTracker accessTokenTracker;
    private AccessToken accessToken;
    private TextView textView;

    public void startFacebook(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FacebookSdk.sdkInitialize(this.getApplicationContext());

        btn = (Button) findViewById(R.id.btn);
        logout = (Button) findViewById(R.id.logout);
        textView = (TextView) findViewById(R.id.text);


        callbackManager = CallbackManager.Factory.create();

        accessTokenTracker = new AccessTokenTracker() {
            @Override
            protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {
                accessToken = currentAccessToken;
                if (accessToken == null) {
                }
                else {
                    GraphRequest request = GraphRequest.newMeRequest(accessToken,
                            new GraphRequest.GraphJSONObjectCallback() {
                                @Override
                                public void onCompleted(JSONObject object, GraphResponse response)  {
                                    if (null != object) {
                                        Log.d("test", "json: " + object.toString());
                                    }
                                    else {
                                        Log.d("test", "json: null");
                                    }
                                }
                            });
                    Bundle parameters = new Bundle();
                    parameters.putString("fields",  "id,birthday,first_name,gender,last_name,location,name,locale,timezone,updated_time,verified,email,hometown");
                    request.setParameters(parameters);
                    request.setAccessToken(accessToken);
                    request.executeAsync();

                }
            }
        };
        accessToken = AccessToken.getCurrentAccessToken();
        if (null == accessToken) {
            logout.setVisibility(View.GONE);
            btn.setVisibility(View.VISIBLE);
            btn.setText("LOGIN");
        }else{
            logout.setVisibility(View.VISIBLE);
            textView.setText("Logged in");
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accessToken = AccessToken.getCurrentAccessToken();
                if (null != accessToken) {
                    startFacebook();
                } else {
                    LoginManager.getInstance().logInWithReadPermissions(LoginActivity.this, Arrays.asList("public_profile", "email", "user_birthday", "user_hometown", "user_location"));
                }
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginManager.getInstance().logOut();
            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        accessTokenTracker.stopTracking();
    }

}