package <missing>;

public class GlobalMembers
{
	public static String x = new String(new char[1000]);
	public static int Main()
	{
		int i;
		int len;
		x.Substring(1) = new Scanner(System.in).nextLine();
		x = tangible.StringFunctions.changeCharacter(x, 0, '0');
		len = x.Substring(1).length();
		for (i = 1;i <= len;i++)
		{
						  if (isn(x.charAt(i)) && !isn(x.charAt(i - 1)))
						  {
						  System.out.print("\n");
						  }
						  if (isn(x.charAt(i)))
						  {
						  System.out.printf("%c",x.charAt(i));
						  }
		}
	   //a getch();
		return 0;
	}

}

