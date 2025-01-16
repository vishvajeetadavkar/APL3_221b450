/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	     
		Juet obj= new Juet();
		obj.set("Vishvajeet");
		System.out.println(obj.get());
	}
	
}
class Juet{
    public int a=5;
	    private String name;
	    public void set(String n){
	        this.name=n;
	        
	    }
	    public String get(){
	        return name;
	    }
}
