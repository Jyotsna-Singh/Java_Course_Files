package mainpackage;

public class StringFile {

	public static void main(String[] args) {
		String name="Jyotsna Singh";
		
		System.out.println("Length: "+name.length());
		System.out.println("First Char: "+name.charAt(0));
		System.out.println("Last Char: "+name.charAt(name.length()-1));
		
		System.out.println("Print Char:");
		for(int i=0; i<name.length();i++)
			System.out.println(name.charAt(i));
		
		System.out.println("Print reverse Char:");
		for(int i=name.length()-1; i>=0;i--)
			System.out.println(name.charAt(i));
		
		System.out.println("Print Words:");
		String text="Jyotsna is a billionaire";
		String[] splitdata=text.split(" ");
		for(int j=0; j<splitdata.length;j++)
			System.out.println(splitdata[j]);

	}

}
