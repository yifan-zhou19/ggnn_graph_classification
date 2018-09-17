package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int k;
		int xi;
		int count = 0;
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
		int[] a = new int[11];
		int[] b = new int[11];
		a[0] = x;
		b[0] = y;
		if (x == 1 || y == 1)
		{
			xi = 1;
		}
		else
		{
		for (i = 1;a[i - 1] > 1;i++)
		{
			a[i] = a[i - 1] / 2;
			b[i] = b[i - 1] / 2;
		}
		for (i = 0;a[i] >= 1;i++)
		{
			for (j = 0;b[j] >= 1;j++)
			{
				if (a[i] == b[j])
				{
					xi = a[i];
					count += 1;
					break;
				}
			}
				if (count != 0)
				{
					break;
				}
		}
		}
		System.out.printf("%d\n",xi);
		return 0;
	}




}

