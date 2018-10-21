package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		a[i] = i + 1;
		}
		if (n < 5)
		{
		System.out.print("empty");
		}
		else if (n >= 5)
		{
			for (i = 2;i < n;i++)
			{
				for (x = 2;x <= a[i];x++)
				{
				if (a[i] % x == 0)
				{
				break;
				}
				}
				k = x;
				for (x = 2;x <= a[i - 2];x++)
				{
				if (a[i - 2] % x == 0)
				{
				break;
				}
				}
				m = x;
			if (k == a[i] && m == a[i - 2])
			{
			System.out.printf("%d %d\n",a[i - 2],a[i]);
			}
			}
		}
	}

}

