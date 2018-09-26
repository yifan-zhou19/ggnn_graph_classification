package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		double sum;
		double[] s = new double[10000];
		s[1] = 1;
		s[2] = 2;
		for (int i = 3 ; i < 100 ; i++)
		{
			s[i] = s[i - 1] + s[i - 2];
	//		printf("%d %d\n",i , s[i]);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = 0;
			for (int i = 1 ; i <= n ; i++)
			{
				sum += s[i + 1] / s[i];
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}
}

