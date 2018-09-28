package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int x;
		int y;
		int i;
		int j;
		int[] b = new int[8];
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
			b[i] = 0;
			for (j = 1;j < y;j++)
			{
				if (a[i][b[i]] < a[i][j])
				{
					b[i] = j;
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < x;j++)
			{
				if (a[i][b[i]] > a[j][b[i]])
				{
					break;
				}
			}
			if (j == x)
			{
				System.out.printf("%d+%d",i,b[i]);
				t = 1;
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
	}



}

