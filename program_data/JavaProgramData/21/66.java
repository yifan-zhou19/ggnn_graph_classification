package <missing>;

public class GlobalMembers
{
	public static int m = 0;
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int[] d = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		float f;
		float sum = 0F;
		double[] b = new double[300];
		double c;
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
			sum = sum + a[i];
		}
		f = sum / n;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - f);
		}
		c = b[0];
		for (i = 0;i < n;i++)
		{
			if (b[i] > c)
			{
				c = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c == b[i])
			{
				d[m] = a[i];
				m++;
			}
		}
		if (d[1] == -1)
		{
			System.out.printf("%d\n",d[0]);
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
				System.out.printf("%d,",d[i]);
			}
			System.out.printf("%d\n",d[m - 1]);
		}
	}


}

