package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int i;
	int a;
	int b;
	int j;
	int temp;
	int[] sz = new int[10000];

	double sum = 0;
	double c;
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
			sz[i] = Integer.parseInt(tempVar2);
		}
		sum = 0;
	a = 2;
		b = 1;
	for (j = 1;j <= sz[i];j++)
	{

		c = 1.0 * a / b;
		temp = a + b;
		sum = sum + c;
		b = a;
		a = temp;
	}
	System.out.printf("%.3lf\n",sum);
	}
	 return 0;
	}
}

