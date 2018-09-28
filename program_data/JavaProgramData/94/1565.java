package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int n;
		int i;
		int m;
		int zonghe = 0;
		int e;
		char x;
		x = ',';
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
				zonghe++;
			}
			else
			{
				a[i] = 0;
			}
		}
		for (m = 0;m < n;m++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] != 0)
				{
					b[m] = a[i];
					a[i] = 0;
					break;
				}
			}
		}
		for (m = 0;m < zonghe;m++)
		{
			for (i = 0;i < zonghe-1;i++)
			{
				if (b[i] > b[i + 1])
				{
					e = b[i + 1];
					b[i + 1] = b[i];
					b[i] = e;
				}
			}
		}
		for (m = 0;m < zonghe-1;m++)
		{
			System.out.printf("%d%c",b[m],x);
		}
		if (m == zonghe-1)
		{
			System.out.printf("%d",b[m]);
		}
	return 0;
	}
}

