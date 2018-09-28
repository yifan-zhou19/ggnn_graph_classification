package <missing>;

public class GlobalMembers
{
	//?? - ??????   


	public static int Main()
	{
		int f = int;
		int n;
		int a;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a = Integer.parseInt(tempVar2);
						}
						System.out.printf("%d\n\n",f(a));

		}
		return 0;
	}
	public static int f(int a)
	{
		if (a == 1)
		{
			return 1;
		}
		if (a == 2)
		{
			return 1;
		}
		else
		{
			return f(a - 1) + f(a - 2);
		}
	}

}

