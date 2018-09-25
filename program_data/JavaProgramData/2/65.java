package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		}; //????
		char[][] b = new char[1000][30]; //????
		int[] len = new int[1000]; //?????????
		int[] c = new int[150]; //???????
		int max = 0; //??????????????
		int i; //????
		int j;
		int k;
		int p;
		int q;
		int r;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			len[i] = String.valueOf(b[i]).length();
			//printf("%d\n", len[i]);
			for (j = 0;j < len[i];j++)
			{
				//printf("%d\n", b[i][j]);
				for (k = 65;k <= 90;k++)
				{
					if (b[i][j] == k)
					{
						c[k]++;
					}
				}
			}
		}
		for (p = 65;p <= 90;p++)
		{
			if (c[p] > max)
			{
				max = c[p];
			}
		}
		for (q = 65;q <= 90;q++)
		{
			if (c[q] == max)
			{
				System.out.printf("%c\n%d\n", q, max);
				for (r = 0;r < m;r++)
				{
					for (s = 0;s < len[r];s++)
					{
						if (b[r][s] == q)
						{
							System.out.printf("%s\n", a[r]);
						}
					}
				}
			}
		}

		return 0;
	}
}

