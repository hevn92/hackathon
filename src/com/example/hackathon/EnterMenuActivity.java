package com.example.hackathon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class EnterMenuActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.hackathon.MESSAGE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_enter_menu);
	    setupActionBar();
	    
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enter_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

    /** Called when the user clicks the Send button */
    public void enterBox(View view) {
    	EditText ed=(EditText)findViewById(R.id.menu_amount);
    	if(ed.getText().toString().length()==0) return;
    	
        Intent intent = new Intent(this, EnterBoxActivity.class);
        
        EditText editText = (EditText) findViewById(R.id.menu_amount);
        String message = editText.getText().toString();
        global.total_money = Float.parseFloat(message); //store it in global variable
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
	
}
