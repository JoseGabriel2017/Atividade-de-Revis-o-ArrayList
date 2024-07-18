package regras;

import iniciais.Empresa;

public class CadastrarEmpresa {

    Empresa[] emp = new Empresa[10];

    int contador = 0;

    public void cadastrarEmpresa(Empresa empresa) {
        if (contador < emp.length) {

            emp[contador] = empresa;
            contador++;
        } else {
            System.out.println("Vetor cheio");
        }
    }

    public Empresa[] listarEmpresas() {
        return emp;
    }

}
