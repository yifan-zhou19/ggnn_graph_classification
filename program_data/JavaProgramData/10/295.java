package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[25];
		int[] b = new int[25];
		int max;
		for (int i = 0;i < n;i++)
		{
			b[i] = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int i = n - 1;i >= 0;i--)
		{
			for (int j = i;j < n;j++)
			{
				if (i != j && a[i] >= a[j] != 0 && b[i] < 1 + b[j])
				{
					b[i] = b[j] + 1;
				}
			}
		}
		max = b[0];
		for (int i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.printf("%d\n",max);
	}

}

