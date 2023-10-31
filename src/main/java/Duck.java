public abstract class Duck {//clase principal
    public Duck(){//se crea el constructor

    }

    @Override
    public String toString() {
        return "Duck{}";
    }

    public void swim(){
        System.out.println("Estoy nadando, incluso puedo flotar");
    }

    public void fly(){

        String str = "Estoy volando...";
        System.out.println(str);

    }

    public void quack(){
        String str =
                "quack";

    }

    public abstract void display();
}
