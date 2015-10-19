import easyaccept.EasyAccept;

public class Facade {


    protected PlusPop sistema;

    public void iniciaSistema() {

        this.sistema = new PlusPop();
    }

    public void logout() {

    }

    public void fechaSistema() {

    }

    public void cadastraUsuario() {

    }

    public void getInfoUsuario() {

    }

    public static void main(String[] args) {
        args = new String[] {
                "Facade",
                "resources/Scripts de Teste/usecase_1.txt",
                "resources/Scripts de Teste/usecase_2.txt",
                "resources/Scripts de Teste/usecase_3.txt",
                "resources/Scripts de Teste/usecase_4.txt",
        };

        EasyAccept.main(args);

    }


}