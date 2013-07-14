package com.example.silencer;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	public void silentClick(View view){
		ToggleButton btn = (ToggleButton)view;
		Log.i("Roohy", "This is True????");
		AudioManager audiomanager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		if ( btn.isChecked()){
			audiomanager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
		}
		else{
			audiomanager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
