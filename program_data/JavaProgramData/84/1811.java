package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int max;
		int se;
		int i;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		max = a[i];
		se = a[i];
		i = 2;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		if (a[i] > max)
		{
			se = max;
			max = a[i];
		}
		else
		{
			if (a[i] < se)
			{
				se = a[i];
			}
		}
		i = 3;
		while (i <= n)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			if (a[i] > max)
			{
				se = max;
				max = a[i];
			}
			else
			{
				if (max > a[i] && a[i] > se)
				{
					se = a[i];
				}
			}
			i++;
		}
			System.out.printf("%d\n%d",max,se);
		return 0;
	}


}

