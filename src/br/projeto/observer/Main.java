package br.projeto.observer;

import br.projeto.observer.Models.PackageItem;
import br.projeto.observer.Publisher.WarehousePublisher;

import java.util.Scanner;

public class Main {

    public static PackageItem cadastrarItem()
    {
        String nome,destino;

        System.out.println("Digite o nome do item");
        nome = new Scanner(System.in).next();
        System.out.println("Digite o destino");
        destino = new Scanner(System.in).next();
        PackageItem item = new PackageItem(nome,destino);

        return item;
    }

    public static void main(String[] args)
    {
        WarehousePublisher sc = new WarehousePublisher();
        System.out.println("---------------------- GERENCIADOR DE ITENS NO GALPAO -----------------------");
        Scanner scanner = new Scanner(System.in);



        while(true)
        {
            System.out.printf("\r\nPressione 1 para checkin\r\nPressione 2 para checkout\r\n");

            int answ = scanner.nextInt();
            if(answ == 1)
            {
                System.out.println("CHECK IN");
                sc.CheckIn(cadastrarItem());
            }
            else if(answ == 2)
            {
                System.out.println("CHECK OUT");
                sc.CheckOut(cadastrarItem());
            }


        }

    }
}
