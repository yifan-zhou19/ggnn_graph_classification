package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int func = int x;
		int n;
		int a;
		int b;
		int c = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			a = func(i);
			b = func(i + 2);
			if (a == 1 && b == 1)
			{
				c++;
				System.out.printf("%d %d\n",i,i + 2);
			}
		}
		if (c == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}

	public static int func(int x)
	{
		int i;
		int j = 0;
		for (i = 1;i <= x;i++)
		{
			if (x % i == 0)
			{
				j++;
			}
		}
		if (j == 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

