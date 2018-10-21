package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int x = 0;
		int t;
	t = n;
	while (n > 0)
	{
		x = x * 10 + n % 10;
	n = n / 10;
	}
	if (t == x)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}
	public static int g(int i)
	{
		int j;
		int t = 0;
		for (j = 2;j < i / 2;j++)
		{
			if (i % j == 0)
			{
			return 0;
			break;
			}
			else
			{
				t++;
			}
		}
	if (t == i / 2 - 1)
	{
		return 1;
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
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = m;i <= n;i++)
	{
		if (f(i) != 0 && g(i) != 0)
		{
			k++;
		if (k == 1)
		{
			System.out.printf("%d",i);
		}
		else
		{
			System.out.printf(",%d",i);
		}
		}
	}
	if (k == 0)
	{
		System.out.print("no\n");
	}
	else
	{
		System.out.print("\n");
	}
	}
}

