package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int t;
		int r;
		int c;
		int s = 0;
		int max;
		int flag;
		int[][] a = new int[9][9];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0,max = 0;j < c;j++)
			{
				if (a[i][j] > a[i][max])
				{
					max = j;
				}
			}
			for (t = 0,flag = 0;t < r;t++)
			{
				if (a[t][max] >= a[i][max])
				{
					flag++;
				}
			}
			if (flag == r)
			{
				s = 1;
				break;
			}
		}
		if (s != 0)
		{
			System.out.printf("%d+%d",i,max);
		}
		else
		{
			System.out.print("No");
		}
	}
}

