package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int h;
		int l;
		int flag;
		int i;
		int j;
		int k;
		int max;
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
		System.in.read();
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				System.in.read();
			}
		}
		for (i = 0;i < h;i++)
		{
			max = 0;
			flag = 1;
			for (j = 0;j < l;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
				}
			}
			for (j = 0;j < l;j++)
			{
				if (max == a[i][j])
				{
					break;
				}
			}
			for (k = 0;k < h;k++)
			{
				if (a[k][j] < max)
				{
					flag = 0;
					break;
				}
			}
			if (flag == 0)
			{
				continue;
			}
			else
			{
				System.out.printf("%d+%d",i,j);
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
	}

}

