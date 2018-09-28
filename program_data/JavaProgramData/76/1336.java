package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int min;
		int max;
		int sum;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int[] a = new int[n];
		int[] b = new int[n];

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
		int[] ce = new int[2 * max + 1];
		for (i = 2 * min;i < 2 * max;i++)
		{
			ce[i] = 1;

		}
		for (j = 0;j < n;j++)
		{
			for (i = 2 * (a[j]);i <= 2 * (b[j]);i++)
			{
				ce[i] = 0;

			}
		}
		sum = 0;
		for (j = 0;j < n;j++)
		{
			for (i = 2 * min;i <= 2 * max;i++)
			{
				sum = sum + ce[i];

			}
		}

		if (sum == 0)
		{
			System.out.printf("%d %d",min,max);
		}
		if (sum != 0)
		{
			System.out.print("no");
		}


		return 0;

	}

}

