package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		double sum;
		int[] num = new int[10000];
		int[] n = new int[200];
		int n1 = 1;
		int n2 = 2;
		int i;
		int j;
		num[1] = n1;
		num[2] = n2;
		num[3] = n1 + n2;
		num[4] = n2 + num[3];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= m;i++)
		{
			sum = 0;
			for (j = 5;j <= n[i] + 1;j++)
			{
				num[j] = num[j - 1] + num[j - 2];
			}
			for (j = 1;j <= n[i];j++)
			{
				sum += 1.0 * num[j + 1] / num[j];
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}

}

