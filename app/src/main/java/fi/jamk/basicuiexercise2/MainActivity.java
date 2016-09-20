package fi.jamk.basicuiexercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, new String[] {"Pasi", "Kari", "Jouni", "Esa", "Hannu"});
        actv.setAdapter(aa);
    }

    public void loginButtonClicked(View view) {
        AutoCompleteTextView login = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        EditText pass = (EditText) findViewById(R.id.editText);
        Editable loginname = login.getText();
        Editable passtext = pass.getText();
        String logininfo = String.format("%s%n%s", loginname, passtext);
        // toast message to screen
        Toast.makeText(getApplicationContext(), logininfo, Toast.LENGTH_SHORT).show();
    }
}
