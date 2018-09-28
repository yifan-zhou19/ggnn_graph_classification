package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char[][] c = new char[50][50];
		String e = new String(new char[50]);
		int i;
		int j;
		int k;
		int l;
		int b;
		int d = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			for (k = j + 1;k <= i;k++)
			{
				b = 0;
				for (l = j;l <= k;l++)
				{
					if (a.charAt(l) != a.charAt(k + j - l))
					{
						b = 1;
						break;
					}
				}
				if (b == 0)
				{
					for (b = j;b <= k;b++)
					{
						c[d][b - j] = a.charAt(b);
					}
				c[d][k - j + 1] = '\0';
				d++;
				}
			}
		}
		for (i = 2;i < 100;i++)
		{
			for (j = 0;j < d;j++)
			{
				if (String.valueOf(c[j]).length() == i)
				{
					System.out.printf("%s\n",c[j]);
				}
			}
		}
		return 0;
	}
}

