package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int[] n = new int[1000];
		double sum = 3.500;
		double a = 3;
		double b = 5;
		double t;
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
		}
		for (j = 0;j < m;j++)
		{
			if (n[j] == 1)
			{
				System.out.print("2.000\n");
			}
			if (n[j] == 2)
			{
				System.out.print("3.500\n");
			}
			if (n[j] > 2)
			{
				for (k = 3;k <= n[j];k++)
				{
					sum += b / a;
					t = a;
					a = b;
					b = t + b;
				}
				System.out.printf("%.3lf\n",sum);
			}
			sum = 3.500;
			a = 3,b = 5;
		}
		return 0;
	}






}

