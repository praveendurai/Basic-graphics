package com.example.basicgraphics;

import com.example.basicgraphics.MainActivity;
import com.example.basicgraphics.R;
import com.example.basicgraphics.SecActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText editc;
	EditText edits;
	EditText editrl;
	EditText editrb;
	Button buttonc;
	Button buttons;
	Button buttonr;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttonc = (Button)findViewById(R.id.button1 );
		buttons = (Button)findViewById(R.id.button2 );
		buttonr = (Button)findViewById(R.id.button3 );
		editc=(EditText) findViewById(R.id.editText1);
		edits=(EditText) findViewById(R.id.editText2);
		editrl=(EditText) findViewById(R.id.editText3);
		editrb=(EditText) findViewById(R.id.editText4);
		
		 buttonc.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String data = editc.getText().toString();
					Toast msg = Toast.makeText(getApplicationContext(), " Circle Converting . . .", Toast.LENGTH_LONG);
					msg.show();
				
					Intent i = new Intent(MainActivity.this,SecActivity.class);
					i.putExtra("csr",data);
					startActivity(i);
				}
			});
		 
		 buttons.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String data = edits.getText().toString();
					Toast msg = Toast.makeText(getApplicationContext(), "Square Converting . . .", Toast.LENGTH_LONG);
					msg.show();
				
					Intent i = new Intent(MainActivity.this,SecActivity.class);
					i.putExtra("csr",data);
					startActivity(i);
				}
			});
		 
		 buttonr.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String data1 = editrl.getText().toString();
					String data2 = editrb.getText().toString();
					Toast msg = Toast.makeText(getApplicationContext(), "Rectangle Converting . . .", Toast.LENGTH_LONG);
					msg.show();
				
					Intent i = new Intent(MainActivity.this,SecActivity.class);
					i.putExtra("csr",data1);
					i.putExtra("r",data2);
					startActivity(i);
				}
			});
		 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
}
