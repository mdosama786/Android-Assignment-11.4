package osama.example.com.assignment114;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import java.util.List;

import osama.example.com.assignment114.db.DBHandler;
import osama.example.com.assignment114.vo.NameVO;

public class MainActivity extends Activity {
	private TextView names;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		StringBuffer details=new StringBuffer();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.names= (TextView) findViewById(R.id.names);
		DBHandler handler=new DBHandler(this);
		
		//Deleting existing rows
		handler.deleteAllNames();
		
        // Inserting names
		handler.addNameVO(new NameVO(1, "Osama", "Ansar"));
		handler.addNameVO(new NameVO(2, "Huzaifa", "Ansar"));
		handler.addNameVO(new NameVO(3, "Saquib", "Ansar"));
		handler.addNameVO(new NameVO(4, "Samad", "Ansar"));

        // Reading all names
        List<NameVO> nameVOList = handler.getAllNameVO();      

        for (NameVO name : nameVOList) {
        	details.append("Id: "+name.getId()+" ,First Name: " + name.getFirstName() + " Last Name: " + name.getLastName()).append("\n");
        }
        names.setText(details.toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
