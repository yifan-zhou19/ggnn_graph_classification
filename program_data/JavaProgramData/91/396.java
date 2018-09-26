package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[150]);
		  String b = new String(new char[150]);
		  a = new Scanner(System.in).nextLine();
		  int i;
		  int len = a.length();
		  for (i = 0;i < len;i++)
		  {
		  b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		  }
		  b = tangible.StringFunctions.changeCharacter(b, len - 1, a.charAt(0) + a.charAt(len - 1));
		  b = tangible.StringFunctions.changeCharacter(b, len, '\0');
		  System.out.println(b);
	}
}

