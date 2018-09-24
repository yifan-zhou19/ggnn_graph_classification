package <missing>;

public class GlobalMembers
{
	public static int Fibonacci(int x)
	{
	int result;
	int i;
	int a = 1;
	int b = 1;
	int c;
	if (x <= 2)
	{
	result = 1;
	}
	else
	{
	for (i = 3;i <= x;i++)
	{
	result = a + b;
	c = b;
	b = result;
	a = c;
	}
	}
	return result;
	}
	public static int Main()
	{
	int n;
	int s;
	int k;
	int[] a = new int[25];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (k = 0;k < n;k++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[k] = Integer.parseInt(tempVar2);
	}
	}
	for (k = 0;k < n;k++)
	{
	s = Fibonacci(a[k]);
	System.out.printf("%d\n",s);
	}
	return 0;
	}



}

