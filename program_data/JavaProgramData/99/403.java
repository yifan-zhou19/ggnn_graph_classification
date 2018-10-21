package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] age = new int[100];
		int m = 0;
		int x = 0;
		int p = 0;
		int q = 0;
		double M;
		double N;
		double P;
		double Q;
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
				age[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] <= 18 && age[i] >= 1)
			{
				m++;
			}
			if (19 <= age[i] != 0 && age[i] <= 35)
			{
				x++;
			}
			if (36 <= age[i] != 0 && age[i] <= 60)
			{
				p++;
			}
			if (age[i] > 60)
			{
				q++;
			}
		}
		M = ((double)m / n) * 100;
		N = ((double)x / n) * 100;
		P = ((double)p / n) * 100;
		Q = ((double)q / n) * 100;
		System.out.printf("1-18: %.2lf%%\n",M);
		System.out.printf("19-35: %.2lf%%\n",N);
		System.out.printf("36-60: %.2lf%%\n",P);
		System.out.printf("60??: %.2lf%%\n",Q);
		return 0;
	}
}

