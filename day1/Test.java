package com.ff.javaoop.day1;

public class Test {

        /*int i ;
        void change(int i){
            i++;
            System.out.println(i);
        }
        void change1(Test t){
            t.i++;
            System.out.println(t.i);
        }
        public static void main(String[] args) {
            Test ta = new Test();
            System.out.println(ta.i); //0
            ta.change(ta.i);//1
            System.out.println(ta.i); //0
            ta.change1(ta);  //1
            System.out.println(ta.i);//1
        }*/
       /* public static void leftshift(int i, int j){
            i+=j; //j=j+i
        }
    public static void main(String args[]){
        int i = 4, j = 2;
        leftshift(i, j);
        System.out.println(i);
    }*/

            Person person = new Person("Test");

            static{
                System.out.println("test static");
            }

            public Test(int a) {

                System.out.println("test constructor");
            }

    public Test() {

    }

    public static void main(String[] args) {
                Test test = new Test();
            }
        }


    class Person{
        static{
            System.out.println("person static");
        }

        public Person(String str) {
            System.out.println("person "+str);
        }
    }


