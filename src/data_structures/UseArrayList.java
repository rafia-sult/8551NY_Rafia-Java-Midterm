package data_structures;

import java.util.ArrayList;

public class UseArrayList {


    /**
     * INSTRUCTIONS
     * <p>
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     * <p>
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {
        // creating an ArrayList
        String[] studentName = new String[4];
//        studentName [0] = "Ellen Parsons";
//        studentName [1] = "Jacob May";
//        studentName [2] = "Chelsea Harmon";
//        studentName [3] = "Jeannette Frank";

        // System.out.println(studentName[2]);


        // demonstrating add on ArrayList

        ArrayList studentNameList = new ArrayList();
        studentNameList.add("Brett Maxwell");
        studentNameList.add("Eddie Spencer");
        studentNameList.add("Alberto Martinez");

        System.out.println(studentNameList);

        // demonstrating remove on ArrayList

        studentNameList.remove("Eddie Spencer");

        System.out.println(studentNameList);

    }

}
