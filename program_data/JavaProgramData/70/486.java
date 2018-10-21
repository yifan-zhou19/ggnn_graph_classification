package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int number = 0;
		double[] x = new double[100];
		double[] y = new double[100];
		double[] s = new double[10000];
		double max;
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
			x[i] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y[i] = Double.parseDouble(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
		for (j = i + 1;j < n;j++)
		{
			s[number] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
			number++;
		}
		}
		max = s[0];
		for (j = 0;j < number;j++)
		{
		if (s[j] > max)
		{
			max = s[j];
		}
		}
		System.out.printf("%.4f\n",max);
		return 0;
	}
}

