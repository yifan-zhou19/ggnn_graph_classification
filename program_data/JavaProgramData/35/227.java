package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int line;
		int row;
		int i;
		int j;
		int[][] a = new int[8][8];
		int max;
		int mline;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			line = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			row = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= line-1;i++)
		{
			for (j = 0;j <= row - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= line-1;i++)
		{
			max = a[i][0];
			mline = 0;
			for (j = 1;j <= row - 1;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					mline = j;
				}
			}
			for (j = 0;j <= line-1;j++)
			{
				if (a[j][mline] < max)
				{
					break;
				}
			}
			if (j >= line)
			{
				break;
			}
		}
		if (i >= line)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d+%d",i,mline);
		}
		System.in.read();
		System.in.read();
	}
}

