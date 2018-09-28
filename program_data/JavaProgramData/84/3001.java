package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int max = 0;
		int b = 0;
		int c;
		int[] a = new int[101];
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
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.printf("%d\n",max);
		c = max;
		for (i = 0;i < n;i++)
		{
			if (a[i] > b && a[i] < c)
			{
				b = a[i];
			}
		}
		System.out.printf("%d",b);
	}

}

