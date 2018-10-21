package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[LEN];
		int[] b = new int[LEN];
		int i;
		int k;
		int s = 0;
		int min;
		int max;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		min = a[0];
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] <= min)
			{
				min = a[i];
			}
			if (b[i] >= max)
			{
				max = b[i];
			}
		}
		for (x = min;x <= max;x += 0.5)
		{
			for (k = 0;k < n;k++)
			{
				if (x >= a[k] != 0 && x <= b[k])
				{
					s++;
					break;
				}
			}
		}
		if (s != 2 * (max - min) + 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}
}

