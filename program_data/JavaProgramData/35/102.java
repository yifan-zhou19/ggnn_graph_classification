package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[8][8];
		int i;
		int j;
		int k;
		int l;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int fuck = 0;
		for (i = 0;i < m;i++)
		{
			int max = 0;
			int loc = 0;
			int num = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					loc = j;
				}
			}
			for (j = 0;j < m;j++)
			{
				if (a[j][loc] < a[i][loc])
				{
					break;
				}
				else
				{
					num++;
				}
			}
			if (num < m)
			{
				continue;
			}
			else
			{
				System.out.printf("%d+%d",i,loc);
				fuck = 1;
				break;
			}
		}
		if (fuck == 0)
		{
			System.out.print("No");
		}
	}
}

