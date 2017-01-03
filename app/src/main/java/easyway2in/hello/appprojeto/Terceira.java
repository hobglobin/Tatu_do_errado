package easyway2in.hello.appprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Terceira extends AppCompatActivity {
    Question Pergunta_2;
    TextView tv=(TextView)findViewById(R.id.Text);
    TextView erro=(TextView)findViewById(R.id.wrong);
    Button but7=(Button)findViewById(R.id.but7);
    Button but8=(Button)findViewById(R.id.but8);
    Button but9=(Button)findViewById(R.id.but9);
    Button but6=(Button)findViewById(R.id.but6);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        Intent intent = getIntent();
        Bundle bundle=intent.getExtras();
        final String errado =bundle.getString("name");



        Pergunta_2.setPergunta("Qual o nome do sistema de encriptação nazista conhecido pela sua eficiência durante a segunda guerra mundial?");
        Pergunta_2.setResposta_certa("Enigma");
        Pergunta_2.setResposta_errada_1("Albus");
        Pergunta_2.setResposta_errada_2("Puzzle");
        Pergunta_2.setResposta_errada_3("Reich");

        tv.setText(Pergunta_2.getPergunta());
        but6.setText(Pergunta_2.getResposta_certa());
        but7.setText(Pergunta_2.getResposta_errada_1());
        but8.setText(Pergunta_2.getResposta_errada_2());
        but9.setText(Pergunta_2.getResposta_errada_3());

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next= new Intent(Terceira.this, Quarta.class);
                startActivity(next);
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            erro.setText(errado);

            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                erro.setText(errado);

            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                erro.setText(errado);

            }
        });
    }
}
