package <missing>;

public class GlobalMembers
{
	public static int f(int a,int min)
	{
		int result = 1;
		int i;
		if (a < min)
		{
			return 0;
		}
		else
		{
			for (i = min;i <= a;i++)
			{
				if (a % i == 0)
				{

					result += f(a / i, i);

				}
			}
			return result;
		}
	}
	public static int Main()
	{
		int n;
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(a, 2));
		}
		return 0;

	}
}

