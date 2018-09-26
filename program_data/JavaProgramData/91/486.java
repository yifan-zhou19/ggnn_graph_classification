package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[101]);
		  String b = new String(new char[101]);
		  a = new Scanner(System.in).nextLine();

		  int i;
		  for (i = 0;i < a.length();i++)
		  {
		  b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt((i + 1) % a.length()));
		  }

		  b = b.substring(0, a.length());
		  System.out.println(b);
		  return 0;
	}

}

