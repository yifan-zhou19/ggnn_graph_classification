package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1000]);
		int i;
		int j;
		int l;
		c = new Scanner(System.in).nextLine();
		l = c.length();
		for (i = 0;i <= (l - 1);i++)
		{
			if ((c.charAt(i) == 32) && (c.charAt(i + 1) == 32))
			{
				i--;
				for (j = i + 1;j <= (l - 1);j++)
				{
						c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 1));
				}
			}
		}
		System.out.println(c);
	   return 0;




	}
}

