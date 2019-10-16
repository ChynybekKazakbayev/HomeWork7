package com.company;

//В задании нельзя использовать циклы for и for each. Только while и Iterator
////    Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
////    Затем программа должна отобразить этот список
////    Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
////    Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
////    После объединения отобразить в консоли список С
//   // В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов, и распечатать отсортированный список С.


import javax.swing.text.html.HTMLDocument;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();

        System.out.println("введите 1 строку из списка А");
        a.add(scanner.nextLine());
        System.out.println("введите 2 строку из списка А");
        a.add(scanner.nextLine());
        System.out.println("введите 3 строку из списка А");
        a.add(scanner.nextLine());
        System.out.println("введите 4 строку из списка А");
        a.add(scanner.nextLine());
        System.out.println("введите 5 строку из списка А");
        a.add(scanner.nextLine());

        Iterator<String> it1 = a.iterator();
        while (it1.hasNext()) {
            String str = it1.next();
            System.out.println(str);
        }
        ArrayList<String> b = new ArrayList<>();
        System.out.println("введите 1 строку из списка B");
        b.add(scanner.nextLine());
        System.out.println("введите 2 строку из списка B");
        b.add(scanner.nextLine());
        System.out.println("введите 3 строку из списка B");
        b.add(scanner.nextLine());
        System.out.println("введите 4 строку из списка B");
        b.add(scanner.nextLine());
        System.out.println("введите 5 строку из списка B");
        b.add(scanner.nextLine());

        Iterator<String> it2 = b.iterator();
        while (it1.hasNext()) {
            String str = it2.next();
            System.out.println(str);


        }
        System.out.println("______________________________");
        ArrayList <String > c = new ArrayList<>();
        it1 = a.iterator();
        it2 = b.iterator();
        Collections.reverse(b);
        while (it1.hasNext()){
            String s = it1.next();
            String st = it2.next();
            c.add(s);
            c.add(st);
            System.out.println(s);
            System.out.println(st);
        }
        Collections.sort(c, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                }else {
                    return 1;
                }
            }

        });
        System.out.println(c);
    }

}
