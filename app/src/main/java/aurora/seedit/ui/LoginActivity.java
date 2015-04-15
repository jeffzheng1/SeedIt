package aurora.seedit.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import aurora.seedit.R;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class LoginActivity extends Activity {

    @InjectView(R.id.app_name) TextView mLoginTitle;
    @InjectView(R.id.login_message) TextView mLoginMessage;
    @InjectView(R.id.facebook_login_button) Button mFacebookLoginButton;
    @InjectView(R.id.google_login_button) Button mGoogleLoginButton;
    @InjectView(R.id.email_login_button) Button mEmailLoginButton;
    @InjectView(R.id.signup_button) TextView mSignupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);

        applyFont();

        mSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
        mEmailLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, LoginDetailActivity.class);
                startActivity(intent);
            }
        });
    }

    private void applyFont() {
        Typeface typeTitle = Typeface.createFromAsset(getAssets(), "fonts/Lato-Hairline.ttf");
//        Typeface typeSecondary = Typeface.createFromAsset(getAssets(), "fonts/Lato-Light.ttf");
        mLoginTitle.setTypeface(typeTitle);
//        mLoginMessage.setTypeface(typeSecondary);
//        mFacebookLoginButton.setTypeface(typeSecondary);
//        mGoogleLoginButton.setTypeface(typeSecondary);
//        mEmailLoginButton.setTypeface(typeSecondary);
//        mSignupButton.setTypeface(typeSecondary);
    }

}
