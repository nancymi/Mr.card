package com.example.mr.card;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.Mr.card.R;

public class splashActivity extends Activity {

	private final int SPLASH_DISPLAY_LENGHT = 6000; // —”≥Ÿ¡˘√Î

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		new Handler().postDelayed(new Runnable() {
			public void run() {
				Intent mainIntent = new Intent(splashActivity.this,
						MainActivity.class);
				splashActivity.this.startActivity(mainIntent);
				splashActivity.this.finish();
			}

		}, SPLASH_DISPLAY_LENGHT);

	}
}
