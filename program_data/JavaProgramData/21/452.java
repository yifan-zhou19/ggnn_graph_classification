package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		int j;
		int t = 0;
		int x;
		int[] a = new int[300];
		double[] b = new double[300];
		double p;
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
			sum += a[i];
		}
		p = (double)sum / n;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - p);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i] >= b[j])
				{
					t++;
				}
			}
			if (t == n)
			{
				System.out.printf("%d",a[i]);
				t = 0;
				x = i;
				break;
			}
			else
			{
				t = 0;
			}
		}
		for (i = x + 1;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i] >= b[j])
				{
					t++;
				}
			}
			if (t == n)
			{
				System.out.printf(",%d",a[i]);
			}
			t = 0;
		}
	}
}

