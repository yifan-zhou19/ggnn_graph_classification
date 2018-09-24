package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] s = new int[A][A];
		int[][] t = new int[A][A];
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		s[4][4] = m;
		t[4][4] = m;
	 for (i = 0;i < n;i++)
	 {
			for (a = 0;a < 9;a++)
			{
				for (b = 0;b < 9;b++)
				{
					if (s[a][b] != 0)
					{

						t[a - 1][b] += s[a][b];
						t[a][b - 1] += s[a][b];
						t[a + 1][b] += s[a][b];
						t[a][b + 1] += s[a][b];
						t[a + 1][b - 1] += s[a][b];
						t[a + 1][b + 1] += s[a][b];
						t[a - 1][b + 1] += s[a][b];
						t[a - 1][b - 1] += s[a][b];
						t[a][b] += s[a][b];
					}
				}
			}
			for (a = 0;a < 9;a++)
			{
				for (b = 0;b < 9;b++)
				{
					s[a][b] = t[a][b];
				}
			}
	 }
		for (a = 0;a < 9;a++)
		{
			for (b = 0;b < 8;b++)
			{
				System.out.printf("%d ",s[a][b]);

			}
			System.out.printf("%d\n",s[a][8]);
		}

		return 0;
	}
}

