package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
		int j;
		int[] c = new int[10000];
		int min = 10000;
		int max = 0;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
		for (i = 1;i <= n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = min;i <= max;i++)
		{
			c[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				c[j] = 1;
			}
		}
		for (j = min;j <= max;j++)
		{
			s = s + c[j];
		}
		if (s == (max - min))
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

