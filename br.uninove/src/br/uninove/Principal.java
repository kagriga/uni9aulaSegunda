
package br.uninove;

public class Principal {

    
    public static void main(String[] args) {
    
        Pessoa p = new Pessoa();
        p.setNome("Kauê Grigaitis");
        p.setIdade(21);
        p.setCpf("123.456.234-79");
        
     Aluno a1 = new Aluno("Ciclano","123.123.432-25", 24, 87223291,new Curso("Adm", 2000));
     Aluno a2 = new Aluno("Kauee","440.868.558-52",22,918113940, new Curso("SI",2000));
        
        
    }
    
}

//Encapsulamento
/* 
    1° Private em cada um dos atributos
    2° Um "Set" para cada um dos atributos
    3° Um "Get" Para cada um dos atributos
*/
