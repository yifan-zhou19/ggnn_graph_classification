package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[200];
		int max;
		int submax;
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
		max = submax = -32321;
		for (i = 0; i < n; i++)
		{
			if (a[i] > max)
			{
				submax = max;
				max = a[i];
			}
			else if (a[i] > submax)
			{
				submax = a[i];
			}
		}

		System.out.printf("%d\n%d", max, submax);

		return 0;
	}

}

