package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		int max;
		int min;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		if (x >= y)
		{
			max = x;
			min = y;
		}
		else
		{
			max = y;
			min = x;
		}
		for (i = 1;i < (n - 1);i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(a[i]) = Integer.parseInt(tempVar4);
			}
			if (a[i] > max)
			{
				min = max;
				max = a[i];
			}
			else if (a[i] < max && a[i]> min)
			{
				min = a[i];
			}
		}
		System.out.printf("%d\n",max);
		System.out.printf("%d",min);
		return 0;
	}
}

