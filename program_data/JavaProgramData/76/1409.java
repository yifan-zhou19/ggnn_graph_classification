package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int min;
		int max;
		double j;
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
		min = a[0];
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (j = 1.0 * min + 0.1;j <= max;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (j < a[i] || j> b[i])
				{
					continue;
				}
				else
				{
					break;
				}
			}
			if (i == n)
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",min,max);
		return 0;
	}
}

