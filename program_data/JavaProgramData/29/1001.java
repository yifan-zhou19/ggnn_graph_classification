package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
	int i;
	int[] result = new int[n];
	for (i = 0;i < n;i++)
	{
		if (i == 0 || i == 1)
		{
		result[i] = 1;
		}
		if (i > 1)
		{
		result[i] = result[i - 1] + result[i - 2];
		}
	}
	int t;
	t = result[n - 1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(result);
	return t;
	}
	public static int Main()
	{
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	int i;
	double S;
	int result1;
	int result2;
	int j;
	for (j = 1;j <= m;j++)
	{
		S = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		   result1 = F(i + 2);
		   result2 = F(i + 3);
		   S += (double)result2 / result1;
		}
		System.out.printf("%.3lf\n",S);
	}

	return 0;
	}

}

