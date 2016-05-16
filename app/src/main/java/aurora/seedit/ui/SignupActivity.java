package aurora.seedit.ui;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import aurora.seedit.R;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class SignupActivity extends ActionBarActivity {

    @InjectView(R.id.facebook_signup_button) Button mFacebookSignupButton;
    @InjectView(R.id.google_signup_button) Button mGoogleSignupButton;
//    @InjectView(R.id.first_name_field) EditText mFirstNameField;
//    @InjectView(R.id.last_name_field) EditText mLastNameField;
    @InjectView(R.id.username_field) EditText mUsernameField;
    @InjectView(R.id.signup_email_field) EditText mSignupEmailField;
    @InjectView(R.id.signup_password_field) EditText mSignupPasswordField;
    @InjectView(R.id.signup_button) Button mSignupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.inject(this);

        applyFont();

        mSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsernameField.getText().toString();
                String password = mSignupPasswordField.getText().toString();
                String email = mSignupEmailField.getText().toString();

                username = username.trim();
                password = password.trim();
                email = email.trim();

                if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(SignupActivity.this);
                    builder.setMessage(R.string.signup_error_message)
                            .setTitle(R.string.signup_error_title)
                            .setPositiveButton(android.R.string.ok, null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                else {
                    // create the new user!
                    ParseUser newUser = new ParseUser();
//                    newUser.put("First Name", firstName);
//                    newUser.put("Last Name", lastName);
                    newUser.setUsername(username);
                    newUser.setPassword(password);
                    newUser.setEmail(email);
                    newUser.signUpInBackground(new SignUpCallback() {
                        @Override
                        public void done(ParseException e) {

                            if (e == null) {
                                // Success!
                                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intent);
                            }
                            else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(
                                        SignupActivity.this);
                                builder.setMessage(e.getMessage())
                                        .setTitle(R.string.signup_error_title)
                                        .setPositiveButton(android.R.string.ok, null);
                                AlertDialog dialog = builder.create();
                                dialog.show();
                            }
                        }
                    });
                }
            }
        });
    }

    private void applyFont() {
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/Lato-Regular.ttf");
        mFacebookSignupButton.setTypeface(type);
        mGoogleSignupButton.setTypeface(type);
        mSignupEmailField.setTypeface(type);
        mSignupPasswordField.setTypeface(type);
        mSignupButton.setTypeface(type);
        mFacebookSignupButton.setTransformationMethod(null);
        mGoogleSignupButton.setTransformationMethod(null);
        mSignupButton.setTransformationMethod(null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up health_icon, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home health_icon
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
