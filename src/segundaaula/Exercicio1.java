/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaaula;

import java.util.Scanner;

/**
 *
 * @author AlunoTrans
 */
public class Exercicio1 {
    public static void main(String[] args) {
        float area, base, altura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a bsae do triangulo");
        base = scanner.nextFloat();
        System.out.println("Digite a altura do triangulo");
        altura = scanner.nextFloat();
        area = (base*altura)/2;
        System.out.println("A área do trinagulo é igual a "+area);
    }
}
