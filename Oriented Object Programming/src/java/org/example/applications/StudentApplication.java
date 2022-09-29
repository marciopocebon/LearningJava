package org.example.applications;

import org.example.entities.Student;

import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String erro = null;
        Student student = new Student(null);

        System.out.println("Digite o nome do aluno: ");
        student.name = sc.nextLine();
        System.out.println("Notas 1, 2 e 3: ");
        student.tri1 = sc.nextDouble();
        student.tri2 = sc.nextDouble();
        student.tri3 = sc.nextDouble();

        System.out.println(student.toString());
        student.approved();
    }
}
