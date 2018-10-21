package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char x;
		char y;
		String a = new String(new char[1000]);
		int[] b = new int[1000];
		int i = 0;
		int m;
		int n;
		char da;
		int db;
		int k;
		int jie1 = 0;
		int jie2 = 0;

		while (scanf("%c", a.charAt(i)) != EOF)
		{
			x = a.charAt(0);
			if (a.charAt(i) == x && jie1 == 0)
			{
				i++;
				jie1 = 1;
				continue;
			}
			if (a.charAt(i) != x && jie2 == 0)
			{
				y = a.charAt(i);
				jie2 = 1;
				i++;
				continue;
			}
			if (a.charAt(i) == x || a.charAt(i) == y)
			{
				i++;
			}
			else
			{
				break;
			}
		}
		for (k = 0;k < 1000;k++)
		{
			b[k] = k;
		}
		while (i != 0)
		{
			for (m = 0;m < i - 1;m++)
			{
				if (a.charAt(m) == x && a.charAt(m + 1) == y)
				{
					i = i - 2;
					System.out.printf("%d %d\n",b[m],b[m + 1]);
					for (n = m;n < i;n++)
					{
						da = a.charAt(n + 2);
						a = tangible.StringFunctions.changeCharacter(a, n, da);
						db = b[n + 2];
						b[n] = db;
					}
					break;
				}
			}
		}
		return 0;
	}

}

