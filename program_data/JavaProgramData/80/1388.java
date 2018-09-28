package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int q;
		int w;
		int e;
		int r;
		int t;
		int y;
		int i;
		int j;
		int z;
		int x = 0;
		int c = 0;
		int v = 0;
		int n = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			e = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			r = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			t = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			y = Integer.parseInt(tempVar6);
		}
		z = r - q;
			for (i = 1;i < z;i++)
			{
				if (((q + i) % 4 == 0 && (q + i) % 100 != 0) || ((q + i) % 400 == 0))
				{
				x = x + 366;
				}
				else
				{
				x = x + 365;
				}
			}
			if ((q % 4 == 0 && q % 100 != 0) || (q % 400 == 0))
			{
				for (i = w;i < 12;i++)
				{
				c = c + a[i];
				}
				if (w == 2)
				{
				c = c + 29 - e;
				}
				else
				{
				if (w == 4 || w == 6 || w == 9 || w == 11)
				{
				c = c + 30 - e;
				}
				else
				{
				c = c + 31 - e;
				}
				}
			}
			else
			{
				for (i = w;i < 12;i++)
				{
				c = c + b[i];
				}
				if (w == 2)
				{
				c = c + 28 - e;
				}
				else
				{
				if (w == 4 || w == 6 || w == 9 || w == 11)
				{
				c = c + 30 - e;
				}
				else
				{
				c = c + 31 - e;
				}
				}
			}
			if ((r % 4 == 0 && r % 100 != 0) || (r % 400 == 0))
			{
				for (i = 0;i < t - 1;i++)
				{
				v = v + a[i];
				}
				v = v + y;
			}
			else
			{
				for (i = 0;i < t - 1;i++)
				{
				v = v + b[i];
				}
				v = v + y;
			}
			if (z == 0)
			{
				if ((r % 4 == 0 && r % 100 != 0) || (r % 400 == 0))
				{
				System.out.printf("%d",c + v - 366);
				}
				else
				{
				System.out.printf("%d",c + v - 365);
				}
			}
			else
			{
			System.out.printf("%d",x + c + v);
			}
	}
}

