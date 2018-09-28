package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		double[] shang = new double[100];
		double sum = 0;
		int[] fenzi = new int[100];
		int[] fenmu = new int[100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			fenzi[0] = 2;
			fenmu[0] = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				if (j == 0)
				{
					fenzi[0] = 2;
					fenmu[0] = 1;
					sum = 2;
				}
				else
				{
					fenzi[j] = fenzi[j - 1] + fenmu[j - 1];
					fenmu[j] = fenzi[j - 1];
					shang[j] = 1.0 * fenzi[j] / fenmu[j];
					sum = sum + shang[j];
				}
			}
			System.out.printf("%.3lf\n",sum);
			sum = 0;
		}
		return 0;
	}
}

