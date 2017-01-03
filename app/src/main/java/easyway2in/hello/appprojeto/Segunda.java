package easyway2in.hello.appprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Segunda extends AppCompatActivity {
    Question Pergunta_1;
    Answer  HA;




    Button but2=(Button)findViewById(R.id.but2);
    Button but3=(Button)findViewById(R.id.but3);
    Button but4=(Button)findViewById(R.id.but4);
    Button but5=(Button)findViewById(R.id.but5);
    TextView tx=(TextView)findViewById(R.id.textView);
    TextView wrong=(TextView)findViewById(R.id.erro);





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myref = database.getReference("https://triviafortrial.firebaseio.com/");
        DatabaseReference acerto= myref.child("Right");
        DatabaseReference erro= myref.child("Wrong");
        erro.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                HA.setErrado(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        acerto.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                HA.setCerto(dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        Pergunta_1.setPergunta("Qual o nome do processo cerimônia pelo(a) qual novos papas são escolhidos?");
        Pergunta_1.setResposta_certa("Conclave");
        Pergunta_1.setResposta_errada_1("Votação clericaniana");
        Pergunta_1.setResposta_errada_2("Votação clérica");
        Pergunta_1.setResposta_errada_3("Cardus");


        tx.setText(Pergunta_1.getPergunta());
        but2.setText(Pergunta_1.getResposta_certa());
        but3.setText(Pergunta_1.getResposta_errada_1());
        but4.setText(Pergunta_1.getResposta_errada_2());
        but5.setText(Pergunta_1.getResposta_errada_3());

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(Segunda.this, Terceira.class);
                startActivity(go);
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.setText(HA.getErrado());

            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.setText(HA.getErrado());

            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.setText(HA.getErrado());

            }
        });
        Intent i = new Intent(Segunda.this,Terceira.class);
        Bundle bundle= new Bundle();
        String errou= HA.getErrado();
        bundle.putString("name", errou);
        i.putExtras(bundle);
        startActivity(i);

        Intent ii = new Intent(Segunda.this,Quarta.class);
        Bundle bundle2=new Bundle();
        String wrong= HA.getCerto();
        bundle2.putString("nao",wrong);
        ii.putExtras(bundle2);
        startActivity(ii);

        Intent iii = new Intent(Segunda.this,Quarta.class);
        Bundle bundle3=new Bundle();
        bundle3.putString("name", errou);
        iii.putExtras(bundle3);
        startActivity(iii);
}
}

