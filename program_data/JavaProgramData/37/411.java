package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
		char[][] b = new char[10000][3];
		String c = new String(new char[10]);
		int i;
		int j;
		int k;
		int l;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}

			for (j = 0;j <= a.length() - 1;j++)
			{
				s = 0;
				c = tangible.StringFunctions.changeCharacter(c, 0, a.charAt(j));

				c = tangible.StringFunctions.changeCharacter(c, 1, '\0');

				for (k = 0;k <= a.length() - 1;k++)
				{
					if (a.charAt(k) == c.charAt(0))
					{
						s++;
					}
				}

				if (s == 1)
				{
					b[i][0] = c.charAt(0);
					b[i][1] = '\0';

					break;
				}
				if (j == a.length() - 1)
				{
					b[i][0] = 'n';
					b[i][1] = 'o';
					b[i][2] = '\0';
				}
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			System.out.printf("%s\n",b[j]);
		}
		return 0;
	}
}

