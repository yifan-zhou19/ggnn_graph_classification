package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1010];
		int[] x = new int[1010];
		int[] y = new int[1010];
		char c = ',';
		int n = 0;
		int i;
		int j;
		i = 1;
		while (c != 10)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			n++;
			i++;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}
		System.out.printf("%d ",n);
		for (i = 1;i <= n;i++)
		{
			for (j = x[i];j < y[i];j++)
			{
				a[j]++;
			}
		}
		int max = 0;
		for (i = 0;i < 1010;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.printf("%d",max);
	}
}

