package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[120]);
	  char t;
	  int i;
	  int b;
	  s = new Scanner(System.in).nextLine();
	  b = s.length();
	  t = s.charAt(0);
	  for (i = 0;i < b - 1;i++)
	  {
		s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + s.charAt(i + 1));
	  }
		s = tangible.StringFunctions.changeCharacter(s, b - 1, s.charAt(b - 1) + t);
	  for (i = 0;i < b;i++)
	  {
		System.out.printf("%c",s.charAt(i));
	  }
	}
}

