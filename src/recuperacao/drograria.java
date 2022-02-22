/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacao;

import java.util.Scanner;

/**
 *
 * @author IFSC
 */
public class drograria{

    int qntRem;
    double Total;
    int tipoRem[] = new int[5];

    public void ComprarRemedio() {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira quantos remédios você irá comprar: ");
        qntRem = s.nextInt();

        for (int i = 0; i < qntRem; i++) {
            System.out.println("Lista remédios de marca:\n"
                    + "1 - Paracetamol\n"
                    + "2 - Benegrip\n"
                    + "Lista remédios genéricos:\n"
                    + "3 - Cloridato de Sertralina\n"
                    + "4 - Clonazepam\n"
                    + "5 - Oxalato de Escitalopram\n"
                    + "Selecione de acordo com o número do remédio.");
            tipoRem[i] = s.nextInt();
        }

        for (int i = 0; i < qntRem; i++) {
            switch (tipoRem[i]) {
                case 1:
                    Total = Total+25;
                    break;
                    
                case 2:
                    Total = Total+50;
                    break;

                case 3:
                    Total = Total+30;
                    break;

                case 4:
                    Total = Total+10;
                    break;

                case 5:
                    Total = Total+35;
                    break;

                default:
                    System.out.println("Erro. Porfavor, confira se selecionou corretamente os rémedios.");
            }
        }
        System.out.println("O total do(s) remédio(s) ficou: "+Total);
    }

}
