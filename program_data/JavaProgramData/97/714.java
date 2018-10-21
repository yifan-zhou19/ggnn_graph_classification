package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;;)
		{
			if (n - 100 >= 0)
			{
				a1 += 1;
				n -= 100;
			}
			else
			{
				break;
			}
		}
		for (;;)
		{
			if (n - 50 >= 0)
			{
				a2 += 1;
				n -= 50;
			}
			else
			{
				break;
			}
		}
		for (;;)
		{
			if (n - 20 >= 0)
			{
				a3 += 1;
				n -= 20;
			}
			else
			{
				break;
			}
		}
		for (;;)
		{
			if (n - 10 >= 0)
			{
				a4 += 1;
				n -= 10;
			}
			else
			{
				break;
			}
		}
		for (;;)
		{
			if (n - 5 >= 0)
			{
				a5 += 1;
				n -= 5;
			}
			else
			{
				break;
			}
		}
		for (;;)
		{
			if (n - 1 >= 0)
			{
				a6 += 1;
				n -= 1;
			}
			else
			{
				break;
			}
		}
		System.out.printf("%d\n",a1);
		System.out.printf("%d\n",a2);
		System.out.printf("%d\n",a3);
		System.out.printf("%d\n",a4);
		System.out.printf("%d\n",a5);
		System.out.printf("%d\n",a6);
		return 0;
	}
}

