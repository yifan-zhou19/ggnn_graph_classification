package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int min;
		int max;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		min = a[0];
		max = b[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		double j;
		int k = 0;
		for (j = min;j <= max;j += 0.5)
		{
			for (i = 0;i < n;i++)
			{
				if (j >= a[i] != 0 && j <= b[i])
				{
					k = 1;
					break;
				}
			}
			if (k == 0)
			{
				System.out.print("no");
				return 0;
			}
			k = 0;
		}
		System.out.printf("%d %d",min,max);
		return 0;
	}

}

