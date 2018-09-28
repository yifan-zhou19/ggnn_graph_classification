package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		char c = 'a';
		int i = 0;
		int j;
		int k;
		int l;
		int m = 0;
		int n;
		while (c != '\n')
		{
			i++;
			c = System.in.read();
			a = tangible.StringFunctions.changeCharacter(a, i, c);
		}
		i--;
		for (j = 2;j <= i;j++)
		{
			for (k = 1;k <= i - j + 1;k++)
			{
				m = 0;
				for (l = 0;l <= j - 1;l++)
				{
					if (a.charAt(k + l) != a.charAt(k + j - l - 1))
					{
						m = 1;
						break;
					}
				}
				if (m == 0)
				{
					for (n = 1;n <= j;n++)
					{
					System.out.print(a.charAt(k + n - 1));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

