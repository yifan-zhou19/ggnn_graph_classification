package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[5000];
		int[] b = new int[5000];
		int[] sum = new int[10001];
		int max = 0;
		int min;
		int c;
		int d;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			c = a[i];
			d = b[i];
			for (;c < d;c++)
			{
				sum[c] = 1;
			}
		}
		 min = a[0];
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
			if (sum[i] == 0)
			{
				System.out.print("no");
				 return 0;
			}
		}
		 System.out.printf("%d %d",min,max);
	return 0;
	}
}

