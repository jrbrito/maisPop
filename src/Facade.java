import easyaccept.EasyAccept;

public class Facade {

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
    public void iniciaSistema() {

        System.out.println("deu certo");

    }

}