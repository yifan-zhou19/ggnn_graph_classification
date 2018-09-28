package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] shuzhou = new int[20002];
		int[] a = new int[500];
		int[] b = new int[500];
		int max = 0;
		int min = 10000;
		int p = 0;
		for (i = 0;i < 20002;i++)
		{
			shuzhou[i] = 1;
		}
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
		for (i = 0;i < n;i++)
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 20002;j++)
			{
				if (2 * a[i] <= j != 0 && b[i] * 2 >= j)
				{
					shuzhou[j] = 0;
				}
			}
		}
		for (i = min * 2;i <= max * 2;i++)
		{
			if (shuzhou[i] == 1)
			{
				p++;
			}
		}
		if (p != 0)
		{
			System.out.print("no");
		}
		if (p == 0)
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}
}

