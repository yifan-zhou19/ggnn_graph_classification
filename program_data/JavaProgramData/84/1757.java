package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] c = new int[100];
		int i;
		int b;
		int x = 0;
		int y = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0; i < n; i++)
		{
			b = a[i];
			if (b > x)
			{
				x = b;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] != x)
			{
				c[i] = a[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			b = c[i];
			if (b > y)
			{
				y = b;
			}
		}
		System.out.printf("%d\n",x);
		System.out.printf("%d\n",y);
		return 0;
	}


}

