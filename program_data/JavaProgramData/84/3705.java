package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0,b = 0;i <= n - 1;i++)
		{
			if (b < a[i])
			{
			b = a[i];
			}
		}

		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] == b)
			{
				break;
			}
		}
		c = i;
		for (i = 0,d = 0;i <= n - 1;i++)
		{
			if (i != c && d < a[i])
			{
			d = a[i];
			}
		}
		System.out.printf("%d\n%d",b,d);
	}

}

