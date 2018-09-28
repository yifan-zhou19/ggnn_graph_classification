package <missing>;

public class GlobalMembers
{
	public static int sum(int a, int b)
	{
		int num;
		if (a > 0 && b > 0)
		{
			if (a < b)
			{
				num = sum(a, a);
			}
			else if (a == 1)
			{
				num = 1;
			}
			else if (b == 1)
			{
				num = 1;
			}
			else
			{
				num = empty(a, b) + full(a, b);
			}
		}
		return (num);
	}
	public static int empty(int a, int b)
	{
		int num;
		if (a == 1)
		{
			num = 1;
		}
		else
		{
			num = sum(a, b - 1);
		}
		return (num);
	}
	public static int full(int a, int b)
	{
		int num;
		if (a == b)
		{
			num = 1;
		}
		else
		{
			num = sum(a - b, b);
		}
		return (num);
	}
	public static int Main()
	{

		int m;
		int n;
		int count1;
		int count2;
		int count;
		int num;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if (n == 1)
			{
				count = full(m, n);
			}
			else if (m == 1)
			{
				count = empty(m, n);
			}
			else
			{
				count1 = empty(m, n);
				count2 = full(m, n);
				count = count1 + count2;
			}
			System.out.printf("%d\n",count);
		}
		return 0;
	}


}

