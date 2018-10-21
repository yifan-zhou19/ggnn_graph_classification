package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[9][9];
		int h;
		int l;
		int i;
		int j;
		int k;
		int max;
		int maxl;
		int min;
		int minh;
		int cas = 0;
		String in = new String(new char[100]);
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
		for (i = 1;i <= h;i++)
		{
			for (j = 1;j <= l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= h;i++)
		{
			max = a[i][1];
			maxl = 1;
			for (j = 1;j <= l;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					maxl = j;
				}
			}
			min = a[1][maxl];
			minh = 1;
			for (k = 2;k <= h;k++)
			{
				if (a[k][maxl] < min)
				{
					min = a[k][maxl];
					minh = k;
				}
			}
			if (minh == i)
			{
				cas = 1;
				System.out.printf("%d+%d\n",i - 1,maxl - 1);
			}
		}
		if (cas == 0)
		{
			System.out.print("No\n");
		}
	}
}

