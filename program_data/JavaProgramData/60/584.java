package <missing>;

public class GlobalMembers
{
	public static int pure(int a)
	{
		int i;
		int m = 0;
		int x;
		for (i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
			break;
			}
			m++;
		}
		if (m == a - 2)
		{
		x = 1;
		}
		else
		{
		x = 0;
		}
		return (x);
	}
	public static int Main()
	{
		int n;
		int i;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			if (pure(i) + pure(i + 2) == 2)
			{
				System.out.printf("%d %d\n",i,i + 2);
				c++;
			}
		}
		if (c == 0)
		{
		System.out.print("empty");
		}
	}

}

