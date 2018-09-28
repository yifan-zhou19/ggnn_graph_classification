package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 2;
		int j;
		int k;
		int t;
		int m;
		int h;
		int x;
		int p;
		String s = new String(new char[1000]);
		char[][] b = new char[1000][1000];
		s = new Scanner(System.in).nextLine();
		m = s.length();
		for (i = 2;i <= m;i = i + 2)
		{
			for (k = 0;k <= m - i;k++)
			{
				h = 0;
				x = 1;
				for (j = k;j <= k + i - 1;j++)
				{
					b[k][j] = s.charAt(i + k - x);
					x++;
				}
				for (t = k;t <= k + i - 1;t++)
				{
					if (b[k][t] != s.charAt(t))
					{
						h = 1;
					break;
					}
				}
					if (h == 0)
					{
						for (p = k;p <= k + i - 1;p++)
						{
							System.out.printf("%c",s.charAt(p));
						}
					System.out.print("\n");
					}

			}
		}
	}


}
