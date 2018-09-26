package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int min;
		int max;
		int tail;
		int[] a = new int[50000];
		int[] b = new int[50000];


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
		tail = b[0];
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		for (i = 1;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
			if (b[i] < tail)
			{
				tail = b[i];
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if ((a[i] <= tail) && (b[i] >= tail))
				{
					tail = b[i];
				}
			}
		}
		if (tail == max)
		{
			System.out.printf("%d %d",min,max);
		}
		else
		{
			System.out.print("no");
		}

		return 0;
	}

}

