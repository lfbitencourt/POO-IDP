import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}

class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}
class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
class Disciplina {
    private String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
class Ensalamento {
    public static void ensalarTurma(Curso curso, Disciplina disciplina, Professor professor, List<Aluno> alunos) {
        Turma turma = new Turma(professor, disciplina);

        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equals(curso.getNome())) {
                turma.adicionarAluno(aluno);
            }
        }

        System.out.println("Turma ensalada: " + disciplina.getNome() + " - Professor: " + professor.getNome());
        System.out.println("Alunos na turma:");
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println(aluno.getNome());
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = {
                new Aluno("Alfredo", "TI"),
                new Aluno("Peterson", "ADM"),
                new Aluno("Wendel", "TI"),
                new Aluno("Ian", "ADM"),
                new Aluno("Debra", "TI"),
                new Aluno("Luana", "ADM"),
                new Aluno("Bruno", "TI"),
                new Aluno("Romeu", "ADM"),
                new Aluno("Julieta", "TI"),
                new Aluno("Maria", "ADM"),
                new Aluno("Capitú", "TI"),
                new Aluno("Bentinho", "ADM"),
                new Aluno("Amélia", "TI")
        };

        // Criação de objetos Professor
        Professor[] professores = {
                new Professor("Mia", "POO"),
                new Professor("Saulo", "Estrutura de Dados"),
                new Professor("Paula", "BI")
        };

        // Criação de objetos Curso
        Curso ti = new Curso("TI");
        Curso adm = new Curso("ADM");

        // Criação de objetos Disciplina
        Disciplina pooTi = new Disciplina("POO do curso de TI");
        Disciplina edTi = new Disciplina("Estrutura de Dados do curso de TI");
        Disciplina biAdm = new Disciplina("BI do curso de ADM");

        // Adicionar disciplinas aos cursos
        ti.adicionarDisciplina(pooTi);
        ti.adicionarDisciplina(edTi);
        adm.adicionarDisciplina(biAdm);

        // 'Ensalação' das turmas
        Ensalamento.ensalarTurma(ti, pooTi, professores[0], List.of(alunos[0], alunos[2], alunos[4], alunos[6], alunos[8], alunos[10], alunos[12]));
        Ensalamento.ensalarTurma(ti, edTi, professores[1], List.of(alunos[0], alunos[2], alunos[4], alunos[6], alunos[8], alunos[10], alunos[12]));
        Ensalamento.ensalarTurma(adm, biAdm, professores[2], List.of(alunos[1], alunos[3], alunos[5], alunos[7], alunos[9], alunos[11]));
    }
}
