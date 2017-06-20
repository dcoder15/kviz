package com.sakota.faks;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class ResultActivity extends Activity {
    Button butRep;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		TextView t=(TextView)findViewById(R.id.textResult);
		butRep=(Button)findViewById(R.id.button2);
		//get score
		Bundle b = getIntent().getExtras();
		int score= b.getInt("score");
		//display score
		t.setText("Broj bodova: "+score);
		butRep.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ResultActivity.this, QuizActivity.class);
					startActivity(intent);
					finish();
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return true;
	}
}
