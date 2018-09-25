package <missing>;

public class GlobalMembers
{
	public static int max(int[] a, int n, int m)
	{
		int y;
		int i;
		if (a[0] == m)
		{
			y = a[1];
		}
		else
		{
			y = a[0];
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == m)
			{
				continue;
			}
			if (a[i] > y)
			{
				y = a[i];
			}
		}
		return y;
	}
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int m;
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
		m = max(a, n, 0);
		System.out.printf("%d\n",m);
		m = max(a, n, m);
		System.out.printf("%d\n",m);
		return 0;
	}





}

