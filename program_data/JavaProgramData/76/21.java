package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][2];
		int n;
		int x;
		int y;
		int d = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		x = a[1][0];
		y = a[1][1];
		for (i = 0;i < n;i++)
		{
			if (a[i][0] < x)
			{
				x = a[i][0];
			}
			if (a[i][1] > y)
			{
				y = a[i][1];
			}
		}
		for (i = 0;i < n;i++)
		{
			d = 0;
			if (a[i][0] != x)
			{
				for (j = 0;j < n;j++)
				{
					if (((a[j][1] > a[i][0]) || (a[j][1] == a[i][0])) && (j != i) && ((a[j][0] < a[i][0]) || (a[j][0] == a[i][0])))
					{
						d = 1;
						break;
					}
				}
			}
			if (a[i][0] == x)
			{
					d = 1;

			}
			if (d == 0)
			{
				break;
			}
		}
		if (d == 1)
		{
			for (i = 0;i < n;i++)
			{
				d = 1;
				if (a[i][1] != y)
				{
					for (j = 0;j < n;j++)
					{
						if (((a[j][0] < a[i][1]) || (a[j][0] == a[i][1])) && (j != i) && ((a[j][1]> a[i][1]) || (a[j][1] == a[i][1])))
						{
							d = 2;
							break;
						}
					}
				}
				if (a[i][1] == y)
				{
					d = 2;
				}
				if (d == 1)
				{
					break;
				}
			}
		}
		if (d == 2)
		{
			System.out.printf("%d %d",x,y);
		}
		if (d != 2)
		{
			System.out.print("no");
		}
		return 0;
	}





}

