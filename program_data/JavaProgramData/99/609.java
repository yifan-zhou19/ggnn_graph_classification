package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] p = new int[100];
		int[] a = {0, 0, 0, 0};
		double[] b = new double[4];
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
				p[i] = Integer.parseInt(tempVar2);
			}
			if (p[i] <= 18)
			{
				a[0]++;
			}
			else if (p[i] <= 35)
			{
				a[1]++;
			}
			else if (p[i] <= 60)
			{
				a[2]++;
			}
			else
			{
				a[3]++;
			}
		}
		for (i = 0;i < 4;i++)
		{
			b[i] = (double)a[i] / n;
			b[i] *= 100.0;
		}
		System.out.printf("1-18: %.2f%%\n",b[0]);
		System.out.printf("19-35: %.2f%%\n",b[1]);
		System.out.printf("36-60: %.2f%%\n",b[2]);
		System.out.printf("60??: %.2f%%\n",b[3]);
		return 0;
	}
}

