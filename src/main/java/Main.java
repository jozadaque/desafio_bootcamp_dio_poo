import br.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

      Curso curso1 =  new Curso();
      curso1.setTitulo("Curso Java");
      curso1.setDescricao("Descrição: Curso de Java");
      curso1.setCargaHoraria(8);

      Curso curso2 =  new Curso();
      curso2.setTitulo("Curso JS");
      curso2.setDescricao("Descrição: Curso de JS");
      curso2.setCargaHoraria(4);


      Mentoria mentoria =  new Mentoria();
      mentoria.setTitulo("Mentoria Java");
      mentoria.setDescricao("Descrição Mentoria Java");
      mentoria.setData(LocalDate.now());

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Development");
      bootcamp.setDescricao("Descrição Bootcamp Java");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria);

      Dev dev1 = new Dev();
      dev1.setNome("Camila");
      dev1.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos  Inscritos "+ dev1.getNome()+": " + dev1.getConteudosInscritos());
      dev1.progredir();

      System.out.println("Conteudos  Concluidos "+ dev1.getNome()+": " + dev1.getConteudosConcluidos());
      System.out.println("Conteudos  Inscritos "+ dev1.getNome()+": " + dev1.getConteudosInscritos());
      System.out.println("XP de " + dev1.getNome() +":" + curso1.calcularXp());

      Dev dev2 = new Dev();
      dev2.setNome("Joao");
      dev2.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos  Inscritos "+ dev2.getNome()+": " + dev1.getConteudosInscritos());
      dev2.progredir();
      dev2.progredir();
      dev2.progredir();

      System.out.println("Conteudos Concluidos "+ dev2.getNome()+": " + dev2.getConteudosConcluidos());
      System.out.println("Conteudos  Inscritos "+ dev2.getNome()+": " + dev1.getConteudosInscritos());
      System.out.println("XP de " + dev2.getNome() +":" + curso2.calcularXp());


}
}
