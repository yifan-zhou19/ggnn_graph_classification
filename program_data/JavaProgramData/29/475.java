package <missing>;

public class GlobalMembers
{
	public static void sum(int n)
	{
		int front = 1;
		int temp;
		int top = 2;
		int bottom = 1;
		double sum = 0;
		int i;
		for (i = 0; i < n; i++)
		{
			sum += (double)top / front;
			temp = top;
			top += front;
			front = temp;
		}
		System.out.printf("%.3lf\n",sum);
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

		for (i = 0; i < m; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum(n);
		}
		return 0;
	}

}

