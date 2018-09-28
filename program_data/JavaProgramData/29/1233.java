package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		double sum = 0.000;
		double[] a = new double[100];
		int[] n = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		sum = 0.000;
		a[0] = 2.000 / 1;

				for (j = 0;j < n[i];j++)
				{


				a[j + 1] = 1.000 + 1.000 / a[j];
				sum += a[j];
				}
				System.out.printf("%.3lf\n",sum);


		}
		return 0;
	}
}

