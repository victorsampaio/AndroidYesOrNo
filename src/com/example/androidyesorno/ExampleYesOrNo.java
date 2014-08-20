package com.example.androidyesorno;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ExampleYesOrNo extends Activity implements OnClickListener {

	private static final int ACTIVITY_YES_NO = 1;

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_example_yes_or_no);

		/** 1 */

		// Yes
		Button btYes = (Button) findViewById(R.id.btnYes);
		btYes.setText("Yes");
		btYes.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent it = new Intent();
				it.putExtra("msg", "Selected Yes!");
				setResult(1, it);
				finish();
			}

		});

		// No
		Button btNo = (Button) findViewById(R.id.btnNo);
		btNo.setText("No");
		btNo.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent it = new Intent();
				it.putExtra("msg", "Selected No");
				setResult(2, it);
				finish();

			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.example_yes_or_no, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}
}
