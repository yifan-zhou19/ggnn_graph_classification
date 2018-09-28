package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int max = 0;
		int nmax = 0;
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
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == max)
			{
		a[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > nmax)
			{
				nmax = a[i];
			}
		}
		System.out.printf("%d\n%d\n",max,nmax);
	}
}

