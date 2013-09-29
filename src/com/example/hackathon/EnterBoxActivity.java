package com.example.hackathon;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EnterBoxActivity extends Activity {

	int i=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	    // Get the message from the intent
	    Intent intent = getIntent();
	    String message = intent.getStringExtra(EnterMenuActivity.EXTRA_MESSAGE);

	 // Set the text view as the activity layout
	    setContentView(R.layout.activity_enter_box);
		// Show the Up button in the action bar.
		setupActionBar();
	    
	    // Create the text view
	    TextView t=(TextView)findViewById(R.id.box_amount);
	    message="$ "+message;
	    t.setText(message);
	    t.setTextColor(Color.RED);

	    
		Button add_box=(Button)findViewById(R.id.add_box);
		add_box.setOnClickListener(new View.OnClickListener() {

	        @Override
	        public void onClick(View v) {
	        	ImageView idk;
	        	switch(i++){
	        	case 1:idk=(ImageView)findViewById(R.id.box1);
	        			idk.setVisibility(View.VISIBLE);
	        		break;
	        	case 2:idk=(ImageView)findViewById(R.id.box2);
	        			idk.setVisibility(View.VISIBLE);
	        		break;
	        	case 3:idk=(ImageView)findViewById(R.id.box3);
    					idk.setVisibility(View.VISIBLE);
	        		break;
	        	case 4:idk=(ImageView)findViewById(R.id.box4);
    					idk.setVisibility(View.VISIBLE);
	        		break;
	        	case 5:idk=(ImageView)findViewById(R.id.box5);
    					idk.setVisibility(View.VISIBLE);
	        		break;
	        	case 6:idk=(ImageView)findViewById(R.id.box6);
    					idk.setVisibility(View.VISIBLE);
	        		break;
	        	}
	        }
	    });
		
		
		Button clear_all=(Button)findViewById(R.id.clear_all);
		clear_all.setOnClickListener(new View.OnClickListener() {

	        @Override
	        public void onClick(View v) {
	        	ImageView idk;
	        	idk=(ImageView)findViewById(R.id.box1);
				idk.setVisibility(View.INVISIBLE);
	        	idk=(ImageView)findViewById(R.id.box2);
				idk.setVisibility(View.INVISIBLE);
	        	idk=(ImageView)findViewById(R.id.box3);
				idk.setVisibility(View.INVISIBLE);
	        	idk=(ImageView)findViewById(R.id.box4);
				idk.setVisibility(View.INVISIBLE);
	        	idk=(ImageView)findViewById(R.id.box5);
				idk.setVisibility(View.INVISIBLE);
	        	idk=(ImageView)findViewById(R.id.box6);
				idk.setVisibility(View.INVISIBLE);
				i=0;
	        }
	    });
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
		getMenuInflater().inflate(R.menu.enter_box, menu);
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

}
