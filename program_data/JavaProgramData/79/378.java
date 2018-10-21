package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int b;
		int c;
		int d;
		int e;
		int f;
		int g = 1;
		int h;
		for (h = 0;h < 10000;h++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		if (b != 0 && c != 0)
		{
		for (d = 0;d < b;d++)
		{
			a[d] = 1;
		}
		for (e = 0,f = b;f > 1;e++)
		{
			if (e < b)
			{
				if (a[e] != 0)
				{
					if (g == c)
					{
						a[e] = 0;
						f = f - 1;
						g = 0;
					}
					g = g + 1;
				}
			}
			else
			{
				e = -1;
			}
		}
		for (e = 0;e < b;e++)
		{
			if (a[e] != 0)
			{
				System.out.printf("%d\n",e+1);
			}
		}
		}
		else
		{
			break;
		}
		}
	}








}

