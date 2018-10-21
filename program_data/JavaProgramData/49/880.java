package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int k;
		int i;
		int j;
		int m;
		String c = new String(new char[500]);
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar);
			}
		if (c.charAt(i) == '\n')
		{
			break;
		}
		}
		t = i;
		for (k = 2;k <= t;k++)
		{
			for (i = 0;i < (t - k + 1);i++)
			{
			for (j = i;j <= (i + k / 2);j++)
			{
			if (c.charAt(j) != c.charAt(2 * i + k - 1 - j))
			{
				break;
			}
			}
		if (j == (i + k / 2 + 1))
		{
			for (m = i;m < i + k;m++)
			{
		System.out.printf("%c",c.charAt(m));
			}
		if (m == i + k)
		{
			System.out.print("\n");
		}
		}
			}
		}
		return 0;
	}
}

