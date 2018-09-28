package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[101]);
		  String b = new String(new char[101]);
		  int i;
		  int j;
		  int count = 1;
		  int c;
		  a = new Scanner(System.in).nextLine();
		  c = a.length();
		  for (i = 0;i < 101;i++)
		  {
		  b = tangible.StringFunctions.changeCharacter(b, i, ' ');
		  }
		  b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		  for (i = 1;i < c;i++)
		  {
		  if ((a.charAt(i) == ' ') && (a.charAt(i - 1) == ' '))
		  {
		  j = 0;
		  }
		  else
		  {
		  b = tangible.StringFunctions.changeCharacter(b, count, a.charAt(i));
		  count++;
		  }
		  b = tangible.StringFunctions.changeCharacter(b, count, '\0');
		  }
		  System.out.printf("%s",b);
		  System.in.read();
		  System.in.read();
	}

}

