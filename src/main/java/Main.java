import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

      Curso curso1 =  new Curso();
      curso1.setTitulo("Curso Java");
      curso1.setDescricao("Descrição: Curso de Java");
      curso1.setCargaHoraria(8);

      System.out.println(curso1);

      Mentoria mentoria =  new Mentoria();
      mentoria.setTitulo("Mentoria Java");
      mentoria.setDescricao("Descrição Mentoria Java");
      mentoria.setCargaHoraria(LocalDate.now());

    }
}
