package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int max;
		int min;
		int[] p = new int[50000];
		int s = 0;
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
			if (b[i] > max)
			{
				max = b[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		for (i = min;i < max;i++)
		{
			p[i] = 1;
		}
		for (i = min;i < max;i++)
		{
			for (t = 0;t < n;t++)
			{
			   if ((i + 0.5) > a[t] && (i + 0.5) < b[t])
			   {
			   p[i] = 0;
			   }
			}
		}
		for (i = min;i < max;i++)
		{
			s += p[i];
		}
		if (s == 0)
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

