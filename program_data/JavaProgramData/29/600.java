package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	int i;
	int j;
	int k;
	int e;
	double result = 0;
	int a;
	int b;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	   a = 1;
	   b = 2;
	   result = 0;
		for (j = 1;j <= k;j++)
		{
			if (j == 1)
			{
			result += 1.0 * b / a;
			}
			else
			{
			e = b;
			b = a + b;
			a = e;
			result += 1.0 * b / a;
			}


		}

	System.out.printf("%.3lf",result);

	System.out.print("\n");
	}







	return 0;
	}
}

