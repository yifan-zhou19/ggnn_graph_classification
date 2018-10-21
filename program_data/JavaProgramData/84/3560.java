package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] a = new int[100];
		int n;
		int max;
		int max2;
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
		}
		if (a[0] > a[1])
		{
			max = a[0];
			max2 = a[1];
		}
		else
		{
			max = a[1];
			max2 = a[0];
		}
		for (i = 2;i < n;i++)
		{
			if (a[i] > max)
			{
				max2 = max;
				max = a[i];
			}
			else if (a[i] <= max != 0 && a[i]> max2)
			{
				max2 = a[i];
			}

		}
		System.out.printf("%d\n%d\n",max,max2);
	}
}

