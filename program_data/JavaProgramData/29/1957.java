package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//



	public static int Main() //(int argc, _TCHAR* argv[])
	{
		int m;
		int M;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			M = Integer.parseInt(tempVar);
		}
		double[] a = new double[5000];
		double[] b = new double[5000];
		int i;
		int j;
		a[1] = 2;
		a[2] = 3;
		b[1] = 1;
		b[2] = 2;
		for (i = 3;i <= 4999;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
			b[i] = b[i - 1] + b[i - 2];
		}
		for (m = 1;m <= M;m++)
		{
			int n;
			int N;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				N = Integer.parseInt(tempVar2);
			}
			double s = 0;
			for (n = 1;n <= N;n++)
			{
				s = s + a[n] / b[n];
			}
			System.out.printf("%.3f\n",s);
		}
		return 0;
	}


}

