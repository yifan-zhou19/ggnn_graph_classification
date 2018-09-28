package <missing>;

public class GlobalMembers
{
	public static int s(int x)
	{
	int j;
	int a = 0;
	for (j = 1;j <= x;j++)
	{
		if (x % j == 0)
		{
			a++;
		}
	}
	if (a == 2)
	{
		return x;
	}
	else
	{
		return false;
	}

	}
	public static int Main()
	{
	int n;
	int i;
	int b = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n - 2;i++)
	{
	if (s(i) != 0 && s(i + 2) != 0)
	{
		b = 1;
		System.out.printf("%d %d\n",i,i + 2);
	}
	}
	if (b == 0)
	{
		System.out.print("empty");
	}
	return 0;
	}
}

