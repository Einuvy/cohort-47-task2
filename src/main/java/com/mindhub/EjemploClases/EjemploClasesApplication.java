package com.mindhub.EjemploClases;

import com.mindhub.EjemploClases.models.Frase;
import com.mindhub.EjemploClases.models.Mentor;
import com.mindhub.EjemploClases.repositories.FraseRepository;
import com.mindhub.EjemploClases.repositories.MentorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class EjemploClasesApplication {

	public static void main(String[] args) {

		SpringApplication.run(EjemploClasesApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(MentorRepository mentorRepository, FraseRepository fraseRepository){
		return args -> {

			Mentor mentor2 = new Mentor("Guillermo", "JAVA", (byte) 33, 1.88f);
			Mentor mentor1 = new Mentor("Facundo", "Java", (byte) 18, 1.82f);
			Mentor mentor3 = new Mentor("Martin", "Java", (byte) 33, 1.88f);
			Mentor mentor4 = new Mentor("SebasTIan", "Java", (byte) 18, 1.82f);
			Mentor mentor5 = new Mentor("Nico", "JS", (byte) 33, 1.88f);
			Mentor mentor6 = new Mentor("Lucre", "Js", (byte) 18, 1.82f);

			mentorRepository.save(mentor2);
			mentorRepository.save(mentor1);
			mentorRepository.save(mentor3);
			mentorRepository.save(mentor4);
			mentorRepository.save(mentor5);
			mentorRepository.save(mentor6);

			Frase frase1 = new Frase("Frase-001", "Recurrente", "Practicamente");
			Frase frase2 = new Frase("Frase-002", "Recurrente", "Rimbombante");
			Frase frase3 = new Frase("Frase-003", "Recurrente", "Tuki Tuki");
			Frase frase4 = new Frase("Frase-004", "Recurrente", "Amazing");
			Frase frase5 = new Frase("Frase-005", "Recurrente", "No lo tienen que adivinar lo tienen que leer");
			Frase frase6 = new Frase("Frase-006", "Recurrente", "Como el padre nuestro");
			Frase frase7 = new Frase("Frase-007", "Recurrente", "Polemico");


			mentor4.addFrase(frase1);
			mentor2.addFrase(frase2);
			mentor6.addFrase(frase3);
			mentor5.addFrase(frase4);
			mentor2.addFrase(frase5);
			mentor1.addFrase(frase6);
			mentor3.addFrase(frase7);

			fraseRepository.save(frase1);
			fraseRepository.save(frase2);
		};
	}
}
