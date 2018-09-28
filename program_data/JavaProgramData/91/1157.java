package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String a = new String(new char[1000]);
	  int i;
	  a = new Scanner(System.in).nextLine();
	  int b = a.charAt(0);
	  for (i = 0;i <= a.length() - 2;i++)
	  {
		  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + a.charAt(i + 1));
	  }
	  a = tangible.StringFunctions.changeCharacter(a, a.length() - 1, a.charAt(a.length() - 1) + b);
	  for (i = 0;i <= a.length() - 1;i++)
	  {
		  System.out.printf("%c",a.charAt(i));
	  }
	}

}

