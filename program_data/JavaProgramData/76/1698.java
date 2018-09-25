package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int min;
		int max;
		int i;
		int j;
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
		for (i = 0;i < n;i++)
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
		for (double m = min;m <= max;m = m + 0.5)
		{
			for (j = 0;j < n;j++)
			{
				if (m >= a[j] != 0 && m <= b[j])
				{
					break;
				}
				if (j == n - 1)
				{
					System.out.print("no");
					return 0;
				}
			}
			if (m == max)
			{
				System.out.printf("%d %d",min,max);
				break;
			}
		}
		return 0;
	}
}

