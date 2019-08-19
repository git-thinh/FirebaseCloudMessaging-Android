package com.example.fcm;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		EditText txt = findViewById(R.id.textView);

		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			String s = "";
			for (String key : bundle.keySet()) {
				Object value = bundle.get(key);
				s += key + ": " + value + "\n\n";
			}
			txt.setText(s);
		}
	}
}