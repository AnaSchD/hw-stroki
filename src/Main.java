import javax.naming.InvalidNameException;
import java.util.Arrays;

public class Main {
    public static void main (String[] args)
    {
        task1();
        task2();
        task3();
        task5();
        task6();
        task7();
    }
    public static void task1() {

        String firstName = " Ivan ";
        String middleName = " Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
    public static void task2()
    {

        String fullName = "Ivanov Ivan Ivanovich";
        String fullname2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullname2);
    }

    public static void task3(){

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }
    public static void task5()
    {
        String fullName = "Ivanov Ivan Ivanovich";
        String[] words = fullName.split(" ");

        var firstName = words [1];
        var middleName = words [2];
        var lastName = words [0];

        System.out.println("Имя сотрудника — " + words [1]);
        System.out.println("Фамилия сотрудника — " + words [0]);
        System.out.println("Отчество сотрудника — " + words [2]);
    }

    public static void task6()
    {
        String fullName = "ivanov ivan ivanovich";
        char[] words = fullName.toCharArray();
        System.out.println(Arrays.toString(words));
        words[0] = Character.toUpperCase(words[0]);
        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++)
        {
            if (words[i] == ' ' )
            {
                words[i + 1] = Character.toUpperCase(words[i + 1]);
            }
        }
        System.out.println(Arrays.toString(words));
    }
    public static void task7()
    {
        String one = "135";
        String two = "246";
        StringBuilder three = new StringBuilder();
        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();

        System.out.println(Arrays.toString(oneArr));
        System.out.println(Arrays.toString(twoArr));

        for (int i = 0; i < oneArr.length; i++)
        {
           three.append(oneArr[i]);
            three.append(twoArr[i]);
        }

        System.out.println("Данные строки — " + three );

    }




}