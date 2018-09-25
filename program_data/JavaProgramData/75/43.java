package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] time = new int[1000];
		int[] a = new int[5000];
		int[] b = new int[5000];
		int i = 1;
		int m;
		int max = 0;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (scanf(",%d", m))
		{
			a[i] = m;
			i++;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		i = 1;
		while (scanf(",%d", m))
		{
			b[i] = m;
			i++;
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			for (k = a[i];k < b[i];k++)
			{
				time[k]++;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (time[i] > max)
			{
				max = time[i];
			}
		}
		System.out.printf("%d %d",n,max);
	}


}

