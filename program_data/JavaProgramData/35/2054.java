package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int h;
		int l;
		int q;
		int w;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < h;i++)
		{
			q = 0;
			w = 0;
			for (j = 0;j < l;j++)
			{
				if (a[i][q] < a[i][j])
				{
					q = j;
				}
			}
			for (j = 0;j < h;j++)
			{
				if (a[j][q] < a[w][q])
				{
					w = j;
				}
			}
			if (w == i)
			{
				System.out.printf("%d+%d\n",w,q);
				sum++;
			}
		}
		if (sum == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

