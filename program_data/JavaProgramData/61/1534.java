package <missing>;

public class GlobalMembers
{
	public static int feibo(int n)
	{
	int a = 0;
	int b = 0;
	int result = 1;
	int i;
	for (i = 1;i <= n - 1;i++)
	{
		a = result;
		result = result + b;
		b = a;
	}
	return result;
	}
	public static int Main()
	{
	int i;
	int n;
	int c;
	int[] result = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		c = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= c;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		result[i] = feibo(n);
	}
	for (i = 1;i <= c;i++)
	{
		System.out.printf("%d\n",result[i]);
	}
	return 0;
	}
}

