package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		int i;
		int j;
		int k;
		int l;
		for (i = 2;i <= c.length();i++)
		{
			for (j = 0;j + i - 1 < c.length();j++)
			{
				final String s1 = "";
				final String s2 = "";
				for (k = j;k <= j + i - 1;k++)
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, k - j, c.charAt(k));
				}
				for (l = 0;l < i;l++)
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, l, s1.charAt(i - l - 1));
				}
				if (strcmp(s1,s2) == 0)
				{
					System.out.printf("%s\n",s1);
				}
			}
		}
	}
}

