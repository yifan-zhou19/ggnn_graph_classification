package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] max = new double[100];
		double len;
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
					a[i] = Double.parseDouble(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					b[i] = Double.parseDouble(tempVar3);
				}
			}
	for (i = 0;i < n;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	c[j] = Math.sqrt((a[j] - a[i]) * (a[j] - a[i]) + (b[j] - b[i]) * (b[j] - b[i]));
	}
	max[i] = c[i + 1];
	for (j = i + 1;j < n;j++)
	{
		if (c[j] > max[i])
		{
			max[i] = c[j];
		}
	}
	}
	len = max[0];
	for (i = 0;i < n;i++)
	{
		if (max[i] > len)
		{
			len = max[i];
		}
	}
	System.out.printf("%g",len);
	}

}

