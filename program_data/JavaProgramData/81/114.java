package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int b;
		int n;
		int m;
		int x;
		int y;
		int simida;
		int[][] a = new int[10][10];

		for (y = 0;y < 5;y++)
		{
			for (x = 0;x < 5;x++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[y][x] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n < 5 && m < 5)
		{
			for (x = 0;x < 5;x++)
			{
				simida = a[n][x];
				a[n][x] = a[m][x];
				a[m][x] = simida;
			}
				for (y = 0;y < 5;y++)
				{
					for (x = 0;x < 5;x++)
					{
						if (x == 4)
						{
							System.out.printf("%d\n",a[y][x]);
						}
						else
						{
							System.out.printf("%d ",a[y][x]);
						}
					}
				}
		}
		else
		{
			System.out.print("error");
		}

			  return 0;
	}

}

