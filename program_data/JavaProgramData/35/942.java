package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int k;
		int n;
		int m;
		int[] line = new int[8];
		int max;
		int lie;
		int num = 0;
		int flag = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < m;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
		}
		}
		for (i = 0;i < n;i++)
		{
			num = 0;
			max = a[i][0];
			for (j = 0;j < m;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					line[i] = j;
				}
			}
			lie = line[i];
			for (k = 0;k < n;k++)
			{
				if (a[k][lie] >= max)
				{
					num = num + 1;
				}
			}
			if (num == n)
			{
				System.out.printf("%d+%d",i,lie);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
	}

}

