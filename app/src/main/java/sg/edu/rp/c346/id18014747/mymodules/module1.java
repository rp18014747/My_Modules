package sg.edu.rp.c346.id18014747.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class module1 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);

        tv = findViewById(R.id.textView);
        Intent intentRecv = getIntent();
        String output = intentRecv.getStringExtra("details");
        tv.setText(output);
    }
}
