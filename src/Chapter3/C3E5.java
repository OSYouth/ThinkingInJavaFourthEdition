package Chapter3;

public class C3E5{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setName("spot");
        dog1.setSays("Ruff!");
        System.out.println(dog1.getName());
        System.out.println(dog1.getSays());
        dog2.setName("scruffy");
        dog2.setSays("Wurf!");
        System.out.println(dog2.getName());
        System.out.println(dog2.getSays());      
    }
}

class Dog{
    String name;
    String says;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the says
     */
    public String getSays() {
        return says;
    }

    /**
     * @param says the says to set
     */
    public void setSays(String says) {
        this.says = says;
    }
    
}