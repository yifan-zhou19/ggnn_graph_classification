package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int i;
		int p;
		for (i = 2;i <= n;i++)
		{
			if (n % i == 0 && n != i)
			{
				p = 0;
				break;
			}
			else
			{
				p = 1;
			}
		}
		return p;
	}
	public static int Main()
	{
		int n;
		int i;
		int o = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			if (f(i) == 1 && f(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				o = 1;
			}
		}
		if (o == 0)
		{
			System.out.print("empty\n");
		}


		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		return 0;
	}

}

