package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[101]);
		  int i;
		  int k = 0;
		  a = new Scanner(System.in).nextLine();
		  for (i = 0;i < 101;i++)
		  {
							if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
							{
							a = tangible.StringFunctions.changeCharacter(a, i, '0');
							}
		  }
		  for (i = 0;i < 101;i++)
		  {
							if (a.charAt(i) != '0' && a.charAt(i) != 0)
							{
							System.out.printf("%c",a.charAt(i));
							}
							else if (a.charAt(i) == 0)
							{
							break;
							}
		  }
		  System.in.read();
		  System.in.read();
	}

}

