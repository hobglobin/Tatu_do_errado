package easyway2in.hello.appprojeto;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

Button but=(Button)findViewById(R.id.but);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent teste=new Intent(MainActivity.this,Segunda.class);
                        startActivity(teste);

                }
            });


    }
}
