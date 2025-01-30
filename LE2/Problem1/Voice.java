public class Voice {

    Animal[] animals = new Animal[5];
    public void prepareVoice() {
       
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        
        
        // hear(animals);
    }
    
    
    public void hear() {
        for (Animal animal : animals) {
            animal.makeVoice(); 
        }
    }
}

