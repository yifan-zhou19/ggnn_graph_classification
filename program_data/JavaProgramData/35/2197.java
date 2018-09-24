package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int b;
		int c;
		int i;
		int j;
		int l;
		int p = 0;
		int q = 0;
		int s = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < b;i++)
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
		for (i = 0;i < b;i++)
		{
			p = 0;
					  q = 0;
			for (j = 1;j < c;j++)
			{
				if (a[i][j] > a[i][q])
				{
					q = j;
				}
			}
			for (l = 0;l < b;l++)
			{
				if (a[i][q] > a[l][q])
				{
					break;
				}
				else
				{
					p++;
				}
			}
			if (p == b)
			{
				System.out.printf("%d+%d",i,q);
				s = 0;
				break;
			}
		}
		if (s != 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

