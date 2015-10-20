import easyaccept.EasyAccept;

public class Facade {


    protected PlusPop sistema;

    public void iniciaSistema() {

        this.sistema = new PlusPop();
    }

    public void login(User user) throws Exception {

        sistema.userLogin(user);

    }

    public void logout(User user) throws Exception {

        sistema.userLogout(user);

    }


    public void cadastraUsuario(String nome,
                                String email,
                                String senha,
                                String dataNasc,
                                String imagem) throws Exception {


            if (sistema.findUsuario(email) == null) {

                User newUser = new User();

                newUser.setNome(nome);
                newUser.setEmail(email);
                newUser.setSenha(senha);
                newUser.setDataNasc(dataNasc);
                newUser.setImagem(imagem);

                sistema.attachUser(newUser);

            }
    }

    public void cadastraUsuario(String nome,
                                String email,
                                String senha,
                                String dataNasc
                                ) throws Exception {


            if (sistema.findUsuario(email) == null) {

                User newUser = new User();

                newUser.setNome(nome);
                newUser.setEmail(email);
                newUser.setSenha(senha);
                newUser.setDataNasc(dataNasc);

                sistema.attachUser(newUser);

            }
    }

    public void getInfoUsuario(String atributo, User user) throws Exception {

        sistema.userDetails(atributo, user.getEmail());

    }

    public void fechaSistema() {

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