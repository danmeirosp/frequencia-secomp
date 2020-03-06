package org.example.persistence;

import org.example.models.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoPersistence {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionaAluno(Aluno aluno) {
        boolean exist = false;
        for(Aluno a:this.alunos){
            if(aluno.getRa().equals(a.getRa())){
               exist = true;
               System.out.println("O aluno ja existe na lista !!");
               break;

            }
        }
        this.alunos.add(aluno);
    }

    public void exibeLista(){
        for(Aluno a:this.alunos){
            System.out.println("Nome :"+ a.getNome() + "RA :"+ a.getRa());
        }
    }
}
