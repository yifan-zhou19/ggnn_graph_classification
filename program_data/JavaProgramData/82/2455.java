package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][2];
		int i;
		int j = 0;
		int x = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i][0] >= 90) && (a[i][0] <= 140) && (a[i][1] >= 60) && (a[i][1] <= 90))
			{
				j++;
			}
			else
			{
				if (x < j)
				{
					x = j;
				}
				j = 0;
			}
			if ((i == n - 1) && (a[i][0] >= 90) && (a[i][0] <= 140) && (a[i][1] >= 60) && (a[i][1] <= 90) && (x < j))
			{
				x = j;
			}
		}
		System.out.printf("%d\n",x);
	}
}

