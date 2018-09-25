package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] a = new double[300];
		double sum = 0;
		double aver;
		double[] b = new double[300];
		double max;
		int i;
		int k;
		int n;
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
			sum = sum + a[i];
		}
		aver = sum / n;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - aver) > max)
			{
				max = Math.abs(a[i] - aver);
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (max - Math.abs(a[i] - aver) <= 1e-6)
			{
				b[k] = a[i];
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",(int)b[i]);
		}
		System.out.printf("%d",(int)b[k - 1]);
	}





}

