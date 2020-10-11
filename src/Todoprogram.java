package com.company;
//import com.company.CommandWords;
import com.company.*;
import com.company.Commandss;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Todoprogram {
    List<String> listofvalue = new ArrayList<String>();

   //------------    Functions of List begins here ---------------
    public void Todoprogramaction() {
        printwelcome();
        System.out.println("Select from the list");
        Scanner inputval = new Scanner(System.in);
        boolean Y = true;
        do {
            int command = inputval.nextInt();
            switch (command) {
                case 1:
                    addlist();
                    break;
                case 2:
                    deletelist();
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    quittask();
                    break;
                case 5:
                    search();
                    break;
                default:
                    System.out.println("Wrong  Input");
                    break;
            }
        } while (Y != false);
    }

    //--------------------------------------------------------------------
    public void addlist() {
        //var addstring = new listofvalue();
        //var addstring = new ArrayList();
        //1var array1 = new Array();

        System.out.println("Add task name");
        Scanner scanner = new Scanner(System.in);
        String inputlistname = scanner.nextLine();
        listofvalue.add(inputlistname);

        System.out.println("Enter the date dd/mm/yyyy");
        // Scanner scanner1 = new Scanner(System.in);
        String commanddate = scanner.next();
        listofvalue.add(commanddate);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            commanddate = dateFormat.format(commanddate);
        } catch (Exception e) {
        }
        System.out.println("list is addded");
        Todoprogramaction();
    }

    //--------------------------------------------------------------------
    public void deletelist() {
        System.out.println("Select the Task from the list");
        if (listofvalue.isEmpty()) {
            System.out.println("List Task is Empty ,Add Task First");
            addlist();
        } else {

            Scanner d = new Scanner(System.in);
            String de = d.nextLine();

           Iterator ite = listofvalue.iterator();
           if (ite.next().equals(de)) {
                for (int i = 0; i < listofvalue.size(); i++) {
                    listofvalue.remove(de);
                    System.out.println(listofvalue + "    is Removed fromt the list");
                }
            }
            printwelcome();
        }
    }
        //---------------------------------------------------------------
        public void print () {
            if (listofvalue.isEmpty()) {
                System.out.println("Task List is Empty  and Insert the Task name");
                quittask();
            } else
                System.out.println("Inserted Task");
            for (int i = 0; i < listofvalue.size(); i++)
                System.out.println(listofvalue.get(i));
           // System.out.println("Total no in ToTo List are " + listofvalue.size());
            printwelcome();
        }
//--------------------------------------------------
        public void search () {
            //search by name
            System.out.println("Insert the Task name to search");
            Scanner d = new Scanner(System.in);
            String de = d.nextLine();
            Iterator ite = listofvalue.iterator();
            while (ite.hasNext()) {
                if (ite.next().equals(de)) {
                    System.out.println(de + "    exists");
                }
            }
            if (listofvalue.isEmpty()) {

                System.out.println("Task List is Empty  and Insert the Task name");
                quittask();
            } else
                System.out.println("Inserted Task");
            for (int i = 0; i < listofvalue.size(); i++)
                System.out.println(listofvalue.get(i));
            System.out.println("Total no in ToTo List are " + listofvalue.size());
            printwelcome();
        }
//------------------------------------------------------------------
        private void printwelcome () {
            System.out.println();
            System.out.println("Welcome to ToDo List Please sekect from the List");
            System.out.println("1>>  Add");
            System.out.println("2>>  Delete");
            System.out.println("3>> Print");
            System.out.println("4 >>Quit");
            //System.out.print("Invalid ");
            System.out.println("5 >>Search");
            System.out.println("-------------------");
            boolean Y=true;
            //System.out.println("Serach by Name");
        }
        //----------------------------------------------------------------
        public void quittask () {
            System.out.println(" Task list is exiting");
            // boolean y=true;
            //if (y= false)
            //{
            // System.out.println(" Program is exiting  byeeeee");
            System.exit(0);
            // }
        }


}

        /*public void search()
        {
            Collections.sort(listofvalue);
            // Sorted List
           // System.out.println("After Sorting:");
            for(String counter: listofvalue){
                System.out.println(counter);
            }7
        }*/



/*   public void play ()
       {
           printWelcome();
           // Enter the main command loop.  Here we repeatedly read commands and
           // execute them until the game is over.
           boolean finished = false;
           while (!finished) {
               Commandss command = parser.getCommand();
               finished = processCommand(command);
           }
           System.out.println("Thank you for playing.  Good bye.");
       }
   }*/
