package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int[] a = new int[N];
		int[] b = new int[N];



		int n;
		int q;
		int[] num = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (q = 1;q <= n;q++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[q] = Integer.parseInt(tempVar2);
			}
		}

		double sum = 0;
		for (q = 1;q <= n;q++)
		{
			for (i = 1;i <= num[q];i++)
			{
					a[1] = 1;
				a[2] = 2;
				 b[1] = 2;
				b[2] = 3;
				a[i + 2] = a[i] + a[i + 1];
				b[i + 2] = b[i] + b[i + 1];
				sum = sum + (b[i] * 1.0 / a[i]);
			}
			System.out.printf("%.3lf\n",sum);
			sum = 0;
		}
		return 0;
	}






}

