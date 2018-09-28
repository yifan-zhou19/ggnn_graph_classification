package <missing>;

public class GlobalMembers
{
	public static int fun(int x)
	{
		int k;
		int a = 0;
		for (k = 3;k < Math.sqrt(x * 1.0) + 1;k += 2)
		{
			if (x % k == 0)
			{
				a = 1;
			return 0;
			}
		}
		if (a == 0)
		{
		return 1;
		}
	}
	public static int Main()
	{
		int n;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 3;i < n;i += 2)
			{
	//			printf("%d %d\n",fun(i),fun(i+2));
				if (fun(i) != 0 && fun(i + 2) != 0)
				{
				System.out.printf("%d %d\n",i,i + 2);
				}
			}
		}

		return 0;
	}
}

