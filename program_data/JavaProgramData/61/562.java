package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[20];
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = 1;
		a[1] = 1;
		for (i = 2;i < 20;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		i = 0;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (i == n - 1)
			{
					System.out.printf("%d",a[m - 1]);
					return 0;
			}
			else
			{
				System.out.printf("%d\n",a[m - 1]);
			}
	i++;
		}
		return 0;
	}
}

