package org.example.entities;

public class Student extends RuntimeException{
    public String name;
    public double tri1;
    public double tri2;
    public double tri3;

    public Student(String erro) {
        super(erro);
    }

    public double Finalnote(Exception e){

        if (tri1 > 30 || tri2 >35 || tri3 > 35){
            throw new Student("As notas só podem ser no máximo: N1 = 30, N2 = 35 e N3 = 35");
        } else if (tri1 < 0 || tri2 < 0 || tri3 < 0) {
            throw new Student("Nota menor que zero!");
        }else {
            return tri1 + tri2 + tri3;
        }
    }

    public void approved(){
        double missingPoints = 60.00;
        if (tri1 + tri2 + tri3 < 60){
            missingPoints = missingPoints - (tri1 + tri2 + tri3);
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f%n", missingPoints) + "POINTS");
        }else {
            System.out.println("PASS");
        }
    }

    @Override
    public String toString() {
        Exception e = null;
        return "FINAL GRADE = " + String.format("%.2f", Finalnote(e));
    }
}
