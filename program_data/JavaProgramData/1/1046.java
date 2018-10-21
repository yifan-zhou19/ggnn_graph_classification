package <missing>;

public class GlobalMembers
{
	public static int f(int c, int t)
	{
		int count = 1;
		int i;
		for (i = t;i < c;i++)
		{
			if (c % i == 0)
			{
				count += f(c / i, i);
			}
		}
		if (i == c)
		{
			return count;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n > 0;n--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = Integer.parseInt(tempVar2);
			}
			if (c == 1 || c == 2)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.printf("%d\n",f(c, 2));
			}
		}
	}
}

