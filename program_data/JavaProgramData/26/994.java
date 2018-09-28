package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String l = new String(new char[102]);
		int j;
		int i;
		int k;
		l = new Scanner(System.in).nextLine();
		for (k = 0;k < 100;k++)
		{
		for (i = 0;i < 100;i++)
		{
			if (l.charAt(i) == ' ' && l.charAt(i + 1) == ' ')
			{
				for (j = i;j < 100;j++)
				{
					l = tangible.StringFunctions.changeCharacter(l, j, l.charAt(j + 1));
				}
			}
		}
		}



		System.out.println(l);

		return 0;
	}
}

