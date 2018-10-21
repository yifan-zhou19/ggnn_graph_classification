package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[300];
		int n = -2;
		int p = -2;
		for (i = 0;i <= 299;i++)
		{
			a[i] = -100;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 299;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i <= 299;i++)
		{
			if (a[i] > n)
			{
				p = n;
				n = a[i];
			}
			if (a[i] > p && a[i] < n)
			{
				p = a[i];
			}
		}
		if (p == -2)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",p);
		}
		return 0;
	}
}

