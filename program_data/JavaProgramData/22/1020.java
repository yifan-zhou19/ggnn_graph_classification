package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int m = 0;
		int[] a = new int[300];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		max = a[0];
		i = 1;
		while (scanf(",%d", a[i]))
		{
			if (a[i] > max)
			{
				m = max;
				max = a[i];
			}
			else if (a[i] > m && a[i] < max)
			{
				m = a[i];
			}
		}
		if (m == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",m);
		}
		return 0;
	}

}

