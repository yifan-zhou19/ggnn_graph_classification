package <missing>;

public class GlobalMembers
{
	public static int count;

	public static void f(int n, int min)
	{
	int i;
	if (n == min)
	{
		count++;
		return;
	}
	if (n % min != 0)
	{
		return;
	}
	for (i = min; i <= n; i++)
	{
	f(n / min, i);
	}
	}


	public static int Main()
	{
	int N;
	int i;
	int num;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		num = Integer.parseInt(tempVar);
	}
	for (j = 1;j <= num;j++)
	{
	count = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		N = Integer.parseInt(tempVar2);
	}
	for (i = 2; i <= N;i++)
	{
	f(N, i);
	}
	System.out.printf("%d\n",count);
	}
	return 0;
	}

}

