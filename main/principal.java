package main;

import iniciais.Empresa;
import iniciais.Funcionario;
import regras.CadastrarEmpresa;
import regras.CadastrarFuncionario;
import java.util.Arrays;

public class principal {

    public static void main(String[] args) {

        CadastrarEmpresa empC = new CadastrarEmpresa();
        CadastrarFuncionario cf = new CadastrarFuncionario();

        Empresa e1 = new Empresa("12543652", "Gabiru", "15153623");
        Empresa e2 = new Empresa("514194156", "Gomom", "5215415");
        Empresa e3 = new Empresa("15154563", "SUAP", "1541875452");

        Funcionario f1 = new Funcionario("85475", "Gabriela", "8565952", "845854", e1);
        Funcionario f2 = new Funcionario("7852323", "Gabriel", "4258", "4545456", e2);
        Funcionario f3 = new Funcionario("5415515", "Gabriele", "5145151", "2120032", e3);

        empC.cadastrarEmpresa(e1);
        empC.cadastrarEmpresa(e2);
        empC.cadastrarEmpresa(e3);

        cf.cadastraFuncionario(f3);
        cf.cadastraFuncionario(f2);
        cf.cadastraFuncionario(f1);

        System.out.println(Arrays.toString(empC.listarEmpresas()));
        System.out.println(Arrays.toString(cf.listFuncionarios()));

    }

}
