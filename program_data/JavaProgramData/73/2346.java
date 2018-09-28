package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int count = 1;
		int p;
		int max;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			max = 0;
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > a[i][max])
				{
					max = j;
				}
			}
			for (p = 0;p < 5;p++)
			{
				if (p == i)
				{
					continue;
				}
				if (a[i][max] > a[p][max])
				{
					break;
				}
			}
			if (p == 5)
			{
				System.out.printf("%d %d %d\n",i + 1,max + 1,a[i][max]);
				count++;
			}
		}
		if (count == 1)
		{
			System.out.print("not found\n");
		}
		return 0;
	}
}

