package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int h;
		int test;
		int i;
		double x;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		int min = a[0];
		int max = b[0];
		for (i = 1;i < n;i++)
		{
				if (b[i] > max)
				{
				   max = b[i];
				}
		}
		for (i = 1;i < n;i++)
		{
				if (a[i] < min)
				{
				   min = a[i];
				}
		}
		for (x = min;x <= max;x += 0.1)
		{
			test = 0;
			for (i = 0;i < n;i++)
			{
				if (x >= a[i] != 0 && x <= b[i])
				{
					test = 1;
					break;
				}
			}
			if (test == 0)
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",min,max);
		return 0;
	}
}

