package <missing>;

public class GlobalMembers
{
	public static int isPrimeNumber(int number)
	{
	int i;
	int N = (int)Math.sqrt((double)number);
	for (i = 2;i <= N;i++)
	{
	if (number % i == 0)
	{
	return 0;
	}
	}
	return 1;
	}

	public static int Main()
	{
	int i;
	int n;
	int k = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	for (i = 2 ; i <= n; i++)
	{
	if (isPrimeNumber(i) == 1)
	{
	if (isPrimeNumber(i + 2) == 1 && (i + 2) <= n)
	{
	System.out.printf("%d %d\n",i,i + 2);
	k++;
	}
	}
	}
	if (k == 0)
	{
	System.out.print("empty");
	}
	}
}

