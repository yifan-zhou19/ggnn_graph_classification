package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int brea = new int(int a,int min);
		int i;
		int n;
		int a;
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
			System.out.printf("%d\n",brea(a, 2));
		}
	}

	public static int brea(int a,int min)
	{
		int result = 1;
		int i;
		if (a < min)
		{
			return (0);
		}
		else if (a == min)
		{
			return (1);
		}
		else
		{
		for (i = min;i < a;i++)
		{
			if (a % i == 0)
			{
				result = result + brea(a / i, i);
			}
		}
		return (result);
		}
	}
}

