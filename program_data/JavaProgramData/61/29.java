package <missing>;

public class GlobalMembers
{
	public static int value(int a)
	{
		int p = 1;
		int q = 1;
		int i;
		int result;
		if (a >= 3)
		{
			for (i = 3;i <= a;i++)
			{
				result = p + q;
				p = q;
				q = result;
			}
		}
		else
		{
			result = 1;
		}
		return result;
	}
	public static int Main()
	{
		int a;
		int i;
		int n;
		int result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			result = value(a);
			System.out.printf("%d\n",result);
		}
		return 0;
	}
}

