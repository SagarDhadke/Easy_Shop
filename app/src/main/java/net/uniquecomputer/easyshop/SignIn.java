package net.uniquecomputer.easyshop;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class SignIn extends AppCompatActivity {

    TextInputLayout Email , Password;
    Button button;
   private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.password);
        button = findViewById(R.id.SignIn_Btn);
        checkBox = findViewById(R.id.checkBox);
        button.setOnClickListener(v -> {
            if (Email.getEditText().getText().toString().isEmpty()){
                Email.setError("Enter Your Email");
                return;
            }else {
                Email.setError(null);
                Email.setErrorEnabled(false);
            }
            if (Password.getEditText().getText().toString().isEmpty()){
                Password.setError("Enter Your Password");
                return;
            }else {
                Password.setError(null);
                Password.setErrorEnabled(false);
            }
            if (checkBox.isChecked()){
                Toast.makeText(SignIn.this, "Sign In Successfully", Toast.LENGTH_SHORT).show();
//                checkBox.setVisibility(View.GONE);
                return;
            }else {
//                checkBox.setVisibility(View.VISIBLE);
//                Toast.makeText(SignIn.this, "Please Check the Terms and Conditions", Toast.LENGTH_SHORT).show();
                checkBox.setError(getResources().getString(R.string.accept_privacy_policy_error));

            }
        });

        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                button.setAlpha(1);
            }else {
                button.setAlpha(0.5f);
            }
        });


//        checkBox.setOnClickListener(v -> {
//            if (checkBox.isChecked()){
//                Toast.makeText(SignIn.this, "Terms and Conditions Accepted", Toast.LENGTH_SHORT).show();
//            }else {
////                Toast.makeText(SignIn.this, "Please Check the Terms and Conditions", Toast.LENGTH_SHORT).show();
//                checkBox.setError(getResources().getString(R.string.accept_privacy_policy_error));
//                return;
//            }
//        });


    }
}