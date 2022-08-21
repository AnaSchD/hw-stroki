import javax.naming.InvalidNameException;

public class Main {
    public static void main (String[] args) {


        String phone = "+960-415 75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);

        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }


        //task1
        String firstName = " Ivan ";
        String middleName = " Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);


        //task2
        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);


        //task3

        String fullName3 = "Иванов Семён Семёнович";
        fullName3 = fullName3.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName3);


    }


}