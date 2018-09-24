package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int total = 0;
		int min;
		int max;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		max = a[0];
		min = a[0];
		for (i = 0;i <= n - 1;i++)
		{
			total = total + a[i];
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}


		if ((total - min * n) == (max * n - total))
		{
			System.out.printf("%d,%d\n",min,max);
		}
		else if ((max * n - total) > (total - min * n))
		{
			System.out.printf("%d",max);
		}
		else
		{
			System.out.printf("%d",min);
		}
	}


}

