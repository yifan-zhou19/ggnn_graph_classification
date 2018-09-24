package <missing>;

public class GlobalMembers
{
	public static int f(int a,int x)
	{
		int count = 1;
		int i;
		for (i = x;i < a;i++)
		{
			if (a % i == 0)
			{
				count += f(a / i, i);
			}
		}
		if (i == a)
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
		int a;
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
				a = Integer.parseInt(tempVar2);
			}
			if (a == 1 || a == 2)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.printf("%d\n",f(a, 2));
			}
		}
	}

}

