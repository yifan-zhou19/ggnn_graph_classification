package <missing>;

public class GlobalMembers
{
	public static int count;
	public static void f(int a,int b)
	{
		int j;
		if (a == 1)
		{
			count += 1;
		}
		else
		{
			for (j = b;j <= a;j++)
			{
				if (a % j == 0)
				{
					f(a / j, j);
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int number;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			count = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number = Integer.parseInt(tempVar2);
			}
			f(number, 2);
			System.out.printf("%d\n",count);
		}
		return 0;
	}
}

