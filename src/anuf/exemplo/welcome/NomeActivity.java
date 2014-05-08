package anuf.exemplo.welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NomeActivity extends Activity{
	
	private Button btnSend;
	private EditText etName;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nome);
		
		etName = (EditText) findViewById(R.id.txtName);
		btnSend = (Button) findViewById(R.id.btnSend);
	
		btnSend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	Intent sendIntent = new Intent(getApplicationContext(), DestinationActivity.class);
        		sendIntent.putExtra("userName", etName.getText().toString());
            	startActivity(sendIntent);
            }
        });

	}

}
