package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int a;
		int b;
		int[][] num = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int[] big = new int[8];
		int[] x = new int[8];
		int[] y = new int[8];
		int sum;
		for (i = 0;i < a;i++)
		{
			big[i] = num[i][0];
			for (j = 0;j < b;j++)
			{
				if (num[i][j] >= big[i])
				{
					big[i] = num[i][j];
					x[i] = i;
					y[i] = j;
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (k = 0;k < a;k++)
			{
				if (num[k][y[i]] < num[x[i]][y[i]])
				{
					sum = 0;
					break;
				}
				else
				{
					sum = 1;
				}
			}
			if (sum == 1)
			{
				System.out.printf("%d+%d",x[i],y[i]);
				break;
			}
		}
		if (sum == 0)
		{
			System.out.print("No");
		}
	}
}

