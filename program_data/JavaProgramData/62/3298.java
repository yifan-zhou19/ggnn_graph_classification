package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	static
	{
	 int space = 1;
	 int i = -1;
	 String a = new String(new char[80]);
	 a = new Scanner(System.in).nextLine();

	 while (a.charAt(++i) != '\0')
	 {
	  if (a.charAt(i) == ' ')
	  {
		  space = 0;
	  }
	  else
	  {
	   if (space == 0)
	   {
		   space = 1;
		   System.out.print(" ");
	   }
		  System.out.printf("%c",a.charAt(i));
	  }
	 }
	}
}
