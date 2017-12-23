class Student{
        String name;
        int age;

        Student(String name){
            this.name = name;
            System.out.println(name + " is a boy.");
        }

        Student(String name, int age){
            this.name = name;
            this.age = age;
            System.out.println(name + " is a boy and he is " + age + " years old.");
        }

        void readBook(){

        }
    }