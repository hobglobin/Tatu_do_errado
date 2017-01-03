package easyway2in.hello.appprojeto;

/**
 * Created by LuizFilipeFerreira on 12/30/2016.
 */

public class Question {
    String Pergunta;
    String Resposta_certa;
    String Resposta_errada_1;
    String Resposta_errada_2;
    String Resposta_errada_3;

    public Question(String pergunta, String resposta_certa, String resposta_errada_1, String resposta_errada_2, String resposta_errada_3) {
        this.Pergunta = pergunta;
        this.Resposta_certa = resposta_certa;
        this.Resposta_errada_1 = resposta_errada_1;
        this.Resposta_errada_2 = resposta_errada_2;
        this.Resposta_errada_3 = resposta_errada_3;
    }

    public String getPergunta() {
        return Pergunta;
    }

    public void setPergunta(String pergunta) {
        Pergunta = pergunta;
    }

    public String getResposta_certa() {
        return Resposta_certa;
    }

    public void setResposta_certa(String resposta_certa) {
        Resposta_certa = resposta_certa;
    }

    public String getResposta_errada_1() {
        return Resposta_errada_1;
    }

    public void setResposta_errada_1(String resposta_errada_1) {
        Resposta_errada_1 = resposta_errada_1;
    }

    public String getResposta_errada_2() {
        return Resposta_errada_2;
    }

    public void setResposta_errada_2(String resposta_errada_2) {
        Resposta_errada_2 = resposta_errada_2;
    }

    public String getResposta_errada_3() {
        return Resposta_errada_3;
    }

    public void setResposta_errada_3(String resposta_errada_3) {
        Resposta_errada_3 = resposta_errada_3;
    }
}
