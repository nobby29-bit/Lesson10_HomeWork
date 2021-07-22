package ru.geekbrains;

import java.util.ArrayList;

public class PhoneActiviti {


    public void addNumber(String surname, String number, ArrayList<TelephoneDirectory> phoneBooks){
        TelephoneDirectory newEntry = new TelephoneDirectory(surname,number);
        phoneBooks.add(newEntry);
        System.out.println("Номер телефона "+number+" добавлен в справочник. Ключ "+surname);
    }

    public void getNumber(String surname,ArrayList<TelephoneDirectory> phoneBooks){

        for (TelephoneDirectory np:phoneBooks){

            if (np.getSurname().equals(surname)){
        System.out.println(surname+" : "+np.getNumber());
    }
}
    }

    public void printBooks (ArrayList<TelephoneDirectory> phoneBooks){
        for (TelephoneDirectory np:phoneBooks){

                System.out.println(np.getSurname()+" : "+np.getNumber());

        }
    }
}
