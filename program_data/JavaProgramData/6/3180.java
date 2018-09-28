package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int fy = 0;
		int num;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (k = 0;k < num;k++)
		{
			System.out.printf("%d\n",fy());
		}
	}
	public static int fy()
	{
		int[][] a = new int[100][100];
		int sum = 0;
		int m;
		int n;
		int i;
		int j;
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
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				*(a + i) = tempVar3;
			}
			sum = sum + *(*(a + i));
			for (j = 1;j < n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					*(a + i) + j = tempVar4;
				}
			}
			sum = sum + *(*(a + i) + n - 1);
		}
		for (i = 1;i < n - 1;i++)
		{
			sum = sum + a[0][i] + a[m - 1][i];
		}
		return sum;
	}
}

