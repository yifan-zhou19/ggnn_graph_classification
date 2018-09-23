package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[10]);
		  String b = new String(new char[10]);
		  a = new Scanner(System.in).nextLine();
		  int i;
		  int l;
		  l = a.length();
		  for (i = 0;i < l;i++)
		  {
			  b = tangible.StringFunctions.changeCharacter(b, l - i - 1, a.charAt(i));
		  }
		  b = tangible.StringFunctions.changeCharacter(b, l, '\0');
		  System.out.println(b);
		  System.in.read();
		  System.in.read();
	}
}

