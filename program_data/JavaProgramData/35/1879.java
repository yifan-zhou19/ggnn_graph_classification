package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[][] a = new int[8][8];
		int mi;
		int ma;
		int p;
		int q;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		for (p = 0;p < i;p++)
		{
			for (q = 0;q < j;q++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[p][q] = Integer.parseInt(tempVar3);
				}
			}
		}
			for (p = 0;p < i;p++)
			{
			for (q = 0;q < j;q++)
			{
				for (x = 0,mi = a[p][q];x < i;x++)
				{
					if (mi > a[x][q])
					{
						mi = a[x][q];
					}
				}
				for (y = 0,ma = a[p][q];y < j;y++)
				{
						if (ma < a[p][y])
						{
							ma = a[p][y];
						}
				}
				if ((mi == a[p][q]) && (ma == a[p][q]))
				{
					break;
				}
			}

	if ((mi == a[p][q]) && (ma == a[p][q]))
	{
		break;
	}
			}
			if (mi == a[p][q] && ma == a[p][q])
			{
				System.out.printf("%d+%d",p,q);
			}
			else
			{
				System.out.print("No\n");
			}
	}

}

