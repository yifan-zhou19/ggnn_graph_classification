package <missing>;

public class GlobalMembers
{
	public static int nax(int x)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
	 a = x / 10000;
	 b = (x - 10000 * a) / 1000;
	 c = (x - 10000 * a - 1000 * b) / 100;
	 d = (x - 10000 * a - 1000 * b - 100 * c) / 10;
	 e = x - 10000 * a - 1000 * b - 100 * c - 10 * d;
	if (a != 0)
	{
		f = 10000 * e+1000 * d + 100 * c + 10 * b + a;
	}
	else if (b != 0)
	{
		f = 1000 * e+100 * d + 10 * c + b;
	}
	else if (c != 0)
	{
		f = 100 * e+10 * d + c;
	}
	else if (d != 0)
	{
		f = 10 * e + d;
	}
	else
	{
		f = e;
	}
	if (x == f)
	{
		return (1);
	}
	else
	{
		return (0);
	}
	}
	public static int max(int x)
	{
		int j;
		int k;
	k = x / 2;
	for (j = 2;j <= k;j++)
	{
		if (x % j == 0)
		{
			break;
		}
	}
	if (j >= k)
	{
		return (1);
	}
	else
	{
		return (0);
	}
	}
	public static void Main()
	{
	int m;
	int n;
	int i;
	int k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = m;i <= n;i++)
	{
		if (max(i) == 1 && nax(i) == 1)
		{
		System.out.printf("%d",i);
		k++;
		break;
		}
	}
	for (i = i + 1;i <= n;i++)
	{
		if (max(i) == 1 && nax(i) == 1)
		{
		System.out.printf(",%d",i);
		k++;
		};
	}
	if (k == 0)
	{
		System.out.print("no");
	}
	}
}

