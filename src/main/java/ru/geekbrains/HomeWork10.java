package ru.geekbrains;

import java.util.ArrayList;

public class HomeWork10 {

    public static void main (String [] args) {

        ArrayList<TelephoneDirectory> phoneBooks = new ArrayList<>();

        System.out.println("Добавление номеров в справочник\n");
        PhoneActiviti num1 = new PhoneActiviti();
        num1.addNumber("Козлов", "1596357",phoneBooks);
        PhoneActiviti num2 = new PhoneActiviti();
        num2.addNumber("Петров", "123654",phoneBooks);
        PhoneActiviti num3 = new PhoneActiviti();
        num3.addNumber("Сидоров", "741258",phoneBooks);
        PhoneActiviti num4 = new PhoneActiviti();
        num4.addNumber("Иванов", "963258",phoneBooks);
        PhoneActiviti num5 = new PhoneActiviti();
        num5.addNumber("Лермонтов", "789654",phoneBooks);
        PhoneActiviti num6 = new PhoneActiviti();
        num6.addNumber("Сидоров", "258963",phoneBooks);
        PhoneActiviti num7 = new PhoneActiviti();
        num7.addNumber("Иванов", "753357",phoneBooks);
        PhoneActiviti num8 = new PhoneActiviti();
        num8.addNumber("Пушкин", "741596",phoneBooks);

        System.out.println("Поиск номера по фаимилии");
        String surname = "Иванов";

        PhoneActiviti numberPhone = new PhoneActiviti();
        numberPhone.getNumber(surname,phoneBooks);

        System.out.println("Сам справочник:");
        for (TelephoneDirectory np:phoneBooks){

            System.out.println(np.getSurname()+" : "+np.getNumber());

        }


    }
}
