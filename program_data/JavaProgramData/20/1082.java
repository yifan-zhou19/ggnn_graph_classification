package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int p;
		int m;
		int c;
		int[] a = new int[101];
		String str = new String(new char[15]);
		String substr = new String(new char[4]);
		String x = new String(new char[20]);
		while (scanf("%s %s",str,substr) != EOF)
		{
			c = 0;
			n = str.length();
			for (i = 0;i < n;i++)
			{
				if (str.charAt(c) < str.charAt(i))
				{
					c = i;
				}
			}
			for (j = 0;j <= c;j++)
			{
				x = tangible.StringFunctions.changeCharacter(x, j, str.charAt(j));
			}
			for (j = c + 1;j <= c + 3;j++)
			{
				x = tangible.StringFunctions.changeCharacter(x, j, substr.charAt(j - c - 1));
			}
			if (c < n - 1)
			{
				for (j = c + 4;j < n + 3;j++)
				{
					x = tangible.StringFunctions.changeCharacter(x, j, str.charAt(j - 3));
				}
			}
			for (i = 0;i < n + 3;i++)
			{
				System.out.print(x.charAt(i));
			}
			System.out.print("\n");
		}
	}

}

