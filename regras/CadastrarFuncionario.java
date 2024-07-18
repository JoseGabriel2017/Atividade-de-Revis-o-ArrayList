package regras;

import iniciais.Funcionario;

public class CadastrarFuncionario {

    int contador = 0;

    Funcionario[] func = new Funcionario[10];

    public void cadastraFuncionario(Funcionario f) {

        func[contador] = f;
        contador++;
    }

    public Funcionario[] listFuncionarios() {
        return func;
    }
}
