package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[321];
		int[] b = new int[321];
		int nb = 0;
		int i;
		int j;
		int t;
		double sum = 0;
		double max = 0;
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
			sum += a[i];
		}

		sum = sum / n;
		for (i = 0;i < n;i++)
		{
			c = Math.abs(sum - a[i]);
			if (c > max)
			{
				max = c;
			}
		}

		for (i = 0;i < n;i++)
		{
			c = Math.abs(sum - a[i]);
			if (Math.abs(c - max) < 1e-6)
			{
				b[nb++] = a[i];
			}
		}

		for (i = 0;i < nb;i++)
		{
			for (j = 0;j < nb - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}

		for (i = 0;i < nb;i++)
		{
			System.out.printf("%d",b[i]);
			if (i < nb - 1)
			{
				System.out.print(",");
			}
		}





	}
}

