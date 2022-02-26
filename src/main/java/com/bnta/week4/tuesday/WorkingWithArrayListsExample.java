//package com.bnta.week4.tuesday;
//import java.util.ArrayList;
//
//public class WorkingWithArrayListsExample
//{
//    static class Person
//    {
//        String getFoo()
//        {
//            return "Bar";
//        }
//    }
//        public static void main(String[] args)
//        {
//            //  specifying type this list will work with
//            //  Generic types - use this - not extracted2
//            ArrayList<String> list = new ArrayList<>();
//            //    list.add(1);
//            //    list.add("2");
//            list.add(new Person());
//            //    list.add(3.14);
//            for (Person person : list)
//            {
//                System.out.println(person.getFoo);
//            }
//        }
//
//        private static void extracted2()
//        {
//            ArrayList list = new ArrayList();
//            list.add(1);
//            list.add("2");
//            list.add(new
//
//                    Person());
//            list.add(3.14);
//
//            for (
//                    Object e : list)
//            {
//                //  Don't use
//                if (e instanceof Person)
//                {
//                    Person person = (Person) e;
//                    System.out.println(person.getFoo);
//                }
//                if (e instanceof String)
//                {
//
//                }
//                if (e instanceof Double)
//                {
//
//                }
//            }
//        }
//
//
//        private static void extracted()
//        {
//            ArrayList list = new ArrayList();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            list.add(4);
//            System.out.println(list.indexOf(1));
//            System.out.println(list.size());
//
//            list.remove(0);
//            System.out.println(list.size());
//            System.out.println(list.contains(1));
//
//            list.clear();
//            System.out.println(list.isEmpty());
//            System.out.println(list.size());
//
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            list.add(4);
//
//            //  most used
//            list.forEach(e ->
//            {
//                System.out.println("e = " + e);
//            });
//
//            //  same thing - commonly used
//            for (Object e : list)
//            {
//                System.out.println("e = " + e);
//            }
//
//            //  hardly used - gives access to index - used for reversing
//            for (int i = 0; i < list.size(); i++)
//            {
//                System.out.println(list.get(i));
//            }
//        }
//}