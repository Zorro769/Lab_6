import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> countryCapitalCatalog = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputCountry;
        String inputCapital;
        String inputProgramOption = null;
        boolean flag = true;

        countryCapitalCatalog.put("Ukraine","Kiev");
        countryCapitalCatalog.put("Poland","Warsaw");
        countryCapitalCatalog.put("Spain","Madrid");
        countryCapitalCatalog.put("Germany","Berlin");
        countryCapitalCatalog.put("France","Paris");
        countryCapitalCatalog.put("Turkey","Ankara");
        countryCapitalCatalog.put("Shri Lanka","Colombo");
        countryCapitalCatalog.put("USA","Washington");
        countryCapitalCatalog.put("Australia","Canberra");
        countryCapitalCatalog.put("England","London");

        while (flag)
        {
            System.out.println("Enther the option of program");
            System.out.println("Option '0'  - exit the program");
            System.out.println("Option '1'  - search the item");
            System.out.println("Option '2'  - insert new record");
            System.out.println("Option '3'  - delete item");
            System.out.println("Option '4'  - review the map");
            inputProgramOption = br.readLine();
            switch (inputProgramOption){

                case "0":
                    flag = false;
                    break;
                case "1":
                    System.out.println("To search the item enter the name of country: ");
                    inputCountry = br.readLine();
                    if(countryCapitalCatalog.containsKey(inputCountry))
                        System.out.println("Searched item " + inputCountry + " " + countryCapitalCatalog.get(inputCountry));
                    else
                        System.out.println("Sorry,but we do not have such item");
                    break;
                case "2":
                    System.out.println("Enter the name of country you want to insert: ");
                    inputCountry = br.readLine();
                    System.out.println("Enter the name of capital you want to insert: ");
                    inputCapital = br.readLine();
                    countryCapitalCatalog.put(inputCountry,inputCapital);
                    break;
                case "3":
                    System.out.println("In order to delete an item you need to enter the country");
                    inputCountry = br.readLine();
                    if (countryCapitalCatalog.containsKey(inputCountry)) {
                        System.out.println("Item " + inputCountry + " " + countryCapitalCatalog.get(inputCountry) + " was removed");
                        countryCapitalCatalog.remove(inputCountry);
                    }
                    else
                        System.out.println("Sorry,but we do not have such item");
                    break;
                case "4":
                    for (String name : countryCapitalCatalog.keySet()) {
                        inputCountry = name;
                        inputCapital = countryCapitalCatalog.get(name);
                        System.out.println(inputCountry + " " + inputCapital);
                    }
                    break;
                default:
                    System.out.println("There is no such option");
                    break;
            }
        }
    }
}