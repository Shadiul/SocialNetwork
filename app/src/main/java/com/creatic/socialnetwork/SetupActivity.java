package com.creatic.socialnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import de.hdodenhof.circleimageview.CircleImageView;

public class SetupActivity extends AppCompatActivity {

    private EditText userName, fullName, countryName;
    private Button saveInformationBtn;
    private CircleImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        userName = findViewById(R.id.setup_username);
        fullName = findViewById(R.id.setup_full_name);
        countryName = findViewById(R.id.setup_country);
        saveInformationBtn = findViewById(R.id.setup_save_button);
        profileImage = findViewById(R.id.setup_profile_image);
    }
}