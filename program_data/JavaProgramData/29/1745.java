package <missing>;

public class GlobalMembers
{
	public static double cal(int n)
	{
		int i;
		int a = 1;
		int b = 2;
		int temp;
	double sum = 0;
	for (i = 0;i < n;i++)
	{
		sum = sum + (double)b / (double)a;
	temp = a + b;
	a = b;
	b = temp;
	}
	return sum;
	}
	public static int Main()
	{
		int m;
		int i;
		int[] n = new int[1000];
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
	System.out.printf("%.3f\n",cal(n[i]));
	}
	}
}

