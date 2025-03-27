abstract class Beverages
{
    void pour(int qty){
    System.out.println("pour"+qty+"ml of beverage");
}
    protected abstract void addcondiment();
    protected void stir(){}
    private void serve(){
        System.out.println("serve through water");
    }
    
    public void templateMethod(int qty){
        pour(qty);
        addcondiment();
        stir();
        serve();
    }
}