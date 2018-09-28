package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int counta;
	int countb;
	int x;
	int y;
	double result;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	counta = 0;
	while (counta < m)
	{
		result = 0.0;
		countb = 0;
		x = 2;
		y = 1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
			while (countb < n)
			{
				result += (1.0 * x) / y;
				x = x + y;
				y = x - y;
				countb++;
			}
		counta += 1;
		System.out.printf("%.3lf\n",result);
	}

	return 0;
	}
}

