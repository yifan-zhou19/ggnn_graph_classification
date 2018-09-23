package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int n = 0;
		int m = 0;
		int p = 0;
		int[] c = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= 100;i++)
		{
			if (x % 2 == 0)
			{
				b[n] = x;
				n++;
				x = x / 2;
			}
			else
			{
				b[n] = x;
				n++;
				x = (x - 1) / 2;
			}
		}
		for (i = 0;i < 100;i++)
		{
			if (y % 2 == 0)
			{
				a[m] = y;
				m++;
				y = y / 2;
			}
			else
			{
				a[m] = y;
				m++;
				y = (y - 1) / 2;
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
			if (b[i] == a[j])
			{
				c[p] = b[i];
				p++;
			}
			}
		}
		System.out.printf("%d",c[0]);
		return 0;
	}





}

