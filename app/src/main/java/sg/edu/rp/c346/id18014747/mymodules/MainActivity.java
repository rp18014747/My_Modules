package sg.edu.rp.c346.id18014747.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, module1.class);
                intent.putExtra("details", "Module Code: C346 \n" +
                        "Module Name: Android Programming \n" +
                        "Academic Year: 2020 \n" +
                        "Semester: 1 \n" +
                        "Module Credit: 4 \n" +
                        "Venue: W66M");
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, module1.class);
                intent.putExtra("details", "Module Code: C349 \n" +
                        "Module Name: iPad Programming \n" +
                        "Academic Year: 2020 \n" +
                        "Semester: 1 \n" +
                        "Module Credit: 4 \n" +
                        "Venue: W22M");
                startActivity(intent);
            }
        });
    }
}
