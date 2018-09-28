package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[9][9];
		int hs;
		int ls;
		int h;
		int l;
		int h1;
		int l1;
		int i;
		int j;
		int b;
		int c = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hs = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			ls = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < hs;i++)
		{
			for (j = 0;j < ls;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (h = 0;h < hs;h++)
		{
			for (l = 0;l < ls;l++)

			{
				b = 0;
				for (h1 = 0;h1 < hs;h1++)
				{
				if (a[h][l] > a[h1][l])
				{
					b = 1;
					break;
				}
				}
				for (l1 = 0;l1 < ls;l1++)
				{
				if (a[h][l] < a[h][l1])
				{
					b = 1;
					break;
				}
				}
				if (b == 0)
				{
					System.out.printf("%d+%d",h,l);
					c = 1;
				}
			}
		}
		if (c == 0)
		{
			System.out.print("No\n");
		}


	}
}

