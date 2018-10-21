package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		String sub = new String(new char[4]);
			while (scanf("%s %s",str,sub) != EOF)
			{
			final String fi = "";
			final String a = "";
			int i;
			int j;
			int k;
			int n = str.length();
			char c = str.charAt(0);
			for (i = 1;i < n;i++)
			{
			if (str.charAt(i) > c)
			{
				c = str.charAt(i);
			}
			}
			for (j = 0;;j++)
			{
				fi = tangible.StringFunctions.changeCharacter(fi, j, str.charAt(j));
				if (str.charAt(j) == c)
				{
					break;
				}
			}
			for (k = j + 1;k < n;k++)
			{
			a = tangible.StringFunctions.changeCharacter(a, k - j - 1, str.charAt(k));
			}
			fi += sub;
			fi += a;
			System.out.printf("%s\n",fi);
			}
		return 0;
	}
}

