package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int s = 0;
		double[] b = new double[300];
		double c;
		double t;
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
			s = s + a[i];
		}
		c = (double)s / (double)n;
		for (i = 0;i < n;i++)
		{
			b[i] = a[i] - c;
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (Math.abs(b[i]) < Math.abs(b[j]))
				{
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
				else if (Math.abs(b[i]) == Math.abs(b[j]))
				{
					if (b[i] > b[j])
					{
						t = b[i];
						b[i] = b[j];
						b[j] = t;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i] = b[i] + c;
		}
		j = 0;
		i = 0;
		while (Math.abs(b[i]) == Math.abs(b[0]))
		{
			if (j > 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",a[i]);
			j++;
			i++;
		}
	}
}

