package easyway2in.hello.appprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Quarta extends AppCompatActivity {
    Question Pergunta_3;
    Button but10=(Button)findViewById(R.id.but10);
    Button but11=(Button)findViewById(R.id.but11);
    Button but12=(Button)findViewById(R.id.but12);
    Button but13=(Button)findViewById(R.id.but13);
    TextView tc=(TextView)findViewById(R.id.View);
    TextView result =(TextView)findViewById(R.id.result);





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta);

        Intent intent =getIntent();
        Bundle bundle= intent.getExtras();
        final String errado =bundle.getString("name");

        Intent intent1 =getIntent();
        Bundle bundle1 =intent1.getExtras();
        final String certo =bundle1.getString("nao");

        Pergunta_3.setPergunta("Qual dos seguintes países não está no hemisfério Sul?");
        Pergunta_3.setResposta_certa("Egito");
        Pergunta_3.setResposta_errada_1("Peru");
        Pergunta_3.setResposta_errada_2("Madagascar");
        Pergunta_3.setResposta_errada_3("Alaska");

        tc.setText(Pergunta_3.getPergunta());
        but10.setText(Pergunta_3.getPergunta());
        but11.setText(Pergunta_3.getResposta_errada_1());
        but12.setText(Pergunta_3.getResposta_errada_2());
        but13.setText(Pergunta_3.getResposta_errada_3());

        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(certo);
            }
        });
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(errado);
            }
        });

        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(errado);
            }
        });

        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(errado);
            }
        });
    }
}
