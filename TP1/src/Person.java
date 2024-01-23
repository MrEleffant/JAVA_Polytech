public class Person {
    private String name;
    private String forName;
    private int age;
    private boolean isPolytechStudent;

    public void setName(String str){
        name = str;
    }
    private void setForName(String str){
        forName = str;
    }
    private void setAge(int age){
        this.age = age;
    }

    private void setPolytechStudent(boolean is){
        isPolytechStudent = is;
    }

    private String getName(){
        return name;
    }
    private String getForName(){
        return forName;
    }
    private int getAge() {
        return age;
    }
    private boolean isPolytechStudent(){
        return isPolytechStudent;
    }

    private void addOneYearToAge(){
        age+=1;
    }

    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("Smith");
        p1.setForName("Jane");
        p1.setAge(21);
        p1.setPolytechStudent(false);

        System.out.println("Je suis " + p1.getName() + " " + p1.getForName() + " j'ai " + p1.getAge());
        if (p1.isPolytechStudent()){
            System.out.println("Eleve de polytech");
        } else {
            System.out.println("NON");
        }

    }
}
