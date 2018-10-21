package <missing>;

public class GlobalMembers
{
	public static int ishuiwen(String c)
	{
		int i;
		int f = 1;
		for (i = 0;i < c.length();i++)
		{
								if (!c[i].equals(c[c.length() - i - 1]))
								{
														  f = 0;
														  break;
								}
		}
		return (f);
	}

	public static int Main()
	{
		String c = new String(new char[510]);
		String jilu = new String(new char[510]);
		int i;
		int j;
		int k;
		c = new Scanner(System.in).nextLine();
		for (i = 2;i <= c.length();i++)
		{
								 for (j = 0;j <= (c.length() - i);j++)
								 {
															  for (k = j;k < (j + i);k++)
															  {
																				  jilu = tangible.StringFunctions.changeCharacter(jilu, k - j, c.charAt(k));
															  }
															  jilu = tangible.StringFunctions.changeCharacter(jilu, i, '\0');
															  if (ishuiwen(jilu) != 0)
															  {
															  System.out.printf("%s\n",jilu);
															  }
								 }
		}
		return 0;
	}
}

