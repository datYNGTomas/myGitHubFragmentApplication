package edu.lclark.githubfragmentapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import edu.lclark.githubfragmentapplication.R;

public class LoginMainActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText mUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

        Button mLoginButton = (Button) findViewById(R.id.fragment_main_login_button);
        mUserName = (EditText) findViewById(R.id.login_main_username_editText);
        ImageView GitHubImage = (ImageView) findViewById(R.id.login_main_image);

        Picasso.with(this).load("http://lukeguerdan.com/img/portfolio/github.png").fit().centerInside().into(GitHubImage);

        mLoginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.fragment_main_login_button && !TextUtils.isEmpty((CharSequence) mUserName)){
           // MainActivityFragment.setmUserLogin(mUserName.getText().toString());

        }

    }
}
