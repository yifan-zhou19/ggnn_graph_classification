package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		final String c = "";
		int i;
		int j;
		int l0;
		int l;
		a = new Scanner(System.in).nextLine();
		l0 = a.length();
		l = 2;
		for (l = 2;l <= l0;l++)
		{
			for (i = 0;i <= l0 - l;i++)
			{
				for (j = i;j < i + l;j++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j - i, a.charAt(j));
				}
				for (j = 0;j < l;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(l - 1 - j));
				}
				if (strcmp(b,c) == 0)
				{
				for (j = 0;j < l;j++)
				{
					System.out.printf("%c",b.charAt(j));
				}
				System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

