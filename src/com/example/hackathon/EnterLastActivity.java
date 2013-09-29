package com.example.hackathon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

public class EnterLastActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.hackathon.MESSAGE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enter_last);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enter_last, menu);
		return true;
	}

	public void enterBox(View view){
		EditText ed1 = (EditText) findViewById(R.id.last_id);
		EditText ed2 = (EditText) findViewById(R.id.last_budget);
		EditText ed3 = (EditText) findViewById(R.id.last_expenses);
		
		if(ed1.getText().toString().length()==0) return;
        Intent intent = new Intent(this, EnterBoxActivity.class);

        String[] s={ed1.getText().toString(), ed2.getText().toString(), ed3.getText().toString()};
        
        intent.putExtra(EXTRA_MESSAGE, s);
        
        startActivity(intent);
	}
	
}
