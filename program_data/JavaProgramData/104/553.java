package <missing>;

public class GlobalMembers
{
	public static int erchashu(int x,int y)
	{
		int i;
		int j;
		int[] a = new int[10];
		int[] b = new int[10];
		int c;
		int d;
		int shu = 0;
		a[0] = x;
		b[0] = y;
		if (x == 1)
		{
			shu = 1;
		}
		else if (y == 1)
		{
			shu = 1;
		}
		else
		{
		for (i = 1;i < 10;i++)
		{
			if (x % 2 == 0)
			{
				a[i] = x / 2;
				x = a[i];
			}
			else
			{
				a[i] = (x - 1) / 2;
				x = a[i];
			}
			if (x == 1)
			{
				c = i;
				break;
			}
		}
		for (i = 1;i < 10;i++)
		{
			if (y % 2 == 0)
			{
				b[i] = y / 2;
				y = b[i];
			}
			else
			{
				b[i] = (y - 1) / 2;
				y = b[i];
			}
			if (y == 1)
			{
				d = i;
				break;
			}
		}
		for (i = 0;i <= c;i++)
		{
			for (j = 0;j <= d;j++)
			{
				if (a[i] == b[j])
				{
					shu = a[i];
					break;
				}
				else if (a[i] > b[j])
				{
					break;
				}
				else
				{
					continue;
				}
			}
			if (shu == 0)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		}
		return shu;
	}
	public static int Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",erchashu(x, y));
	}
}

