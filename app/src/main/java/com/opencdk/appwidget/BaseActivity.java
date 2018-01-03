package com.opencdk.appwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public abstract class BaseActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

//		ActionBar actionBar = getSupportActionBar();
//		if (actionBar != null) {
//			actionBar.setLogo(R.drawable.ic_launcher);
//
//			actionBar.setHomeButtonEnabled(true);
//			actionBar.setDisplayUseLogoEnabled(false);
//			actionBar.setDisplayShowHomeEnabled(false);
//
//			actionBar.setDisplayHomeAsUpEnabled(true);
//		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
				this.finish();
				return true;
		}

		return super.onOptionsItemSelected(item);
	}

}
