package <missing>;

public class GlobalMembers
{
	public static int ishuiwen(String p, int x)
	{
		int j;
		int result = 0;
		final String q = "";
		for (j = 0;j < x;j++)
		{
			q = tangible.StringFunctions.changeCharacter(q, j, p[x - j - 1]);
		}
		if (strcmp(p,q) == 0)
		{
			result = 1;
		}
		return result;
	}

	public static int Main()
	{
		String a = new String(new char[505]);
		final String b = "";
		int i;
		int len;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 2;i <= len;i++)
		{
			for (j = 0;j < len + 1 - i;j++)
			{
				for (k = 0;k < i;k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(k + j));
				}
				if (ishuiwen(b, i) != 0)
				{
					System.out.printf("%s\n",b);
				}
			}
		}
		return 0;
	}
}

