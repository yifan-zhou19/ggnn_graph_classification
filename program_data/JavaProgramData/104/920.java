package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[30];
		int[] b = new int[30];
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
		a[0] = x;
		b[0] = y;
		for (i = 0;i < 30;i++)
		{
			if (a[i] > 1 && a[i] % 2 == 0)
			{
				a[i + 1] = a[i] / 2;
			}
			else if (a[i] > 1 && a[i] % 2 == 1)
			{
				a[i + 1] = (a[i] - 1) / 2;
			}
			else
			{
				break;
			}
		}
		m = i + 1;
		for (i = 0;i < 30;i++)
		{
			if (b[i] > 1 && b[i] % 2 == 0)
			{
				b[i + 1] = b[i] / 2;
			}
			else if (b[i] > 1 && b[i] % 2 == 1)
			{
				b[i + 1] = (b[i] - 1) / 2;
			}
			else
			{
				break;
			}
		}
		n = i + 1;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[j] == a[i])
				{
					System.out.printf("%d",a[i]);
					break;
				}
			}
			if (j != n)
			{
				break;
			}
		}
	return 0;
	}



}

