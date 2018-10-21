package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] fenzi = new int[1000];
		int[] fenmu = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] xiangshu = new int[m];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *sum=(double*)malloc(sizeof(double)*m);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		double sum = (double)malloc((Double.SIZE / Byte.SIZE) * m);
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xiangshu[i] = Integer.parseInt(tempVar2);
			}
		}
		fenzi[0] = 2;
		fenzi[1] = 3;
		fenmu[0] = 1;
		fenmu[1] = 2;
		for (i = 2;i < 1000;i++)
		{
			fenzi[i] = fenzi[i - 1] + fenzi[i - 2];
		}
		for (i = 2;i < 1000;i++)
		{
			fenmu[i] = fenmu[i - 1] + fenmu[i - 2];
		}
		for (i = 0;i < m;i++)
		{
			sum[i] = 0;
			for (j = 0;j < xiangshu[i];j++)
			{
				sum[i] += fenzi[j] * 1.0 / fenmu[j];
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",sum[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(xiangshu);
		return 0;
	}
}

