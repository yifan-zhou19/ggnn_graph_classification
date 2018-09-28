package <missing>;

public class GlobalMembers
{
	public static int r(int a, int b)
	{
		int i;
		int j;
		if (a < 10)
		{
			return (b + a);
		}
		int sum = 1;
		for (i = 1;;i++)
		{
			if (sum > a)
			{
				break;
			}
			sum *= 10;
		}
		b += (a % 10) * (sum / 10);
		return (r(a / 10, b));
	}






	public static int Main()
	{
		int a;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			if (a < 0)
			{
				a = -a;
				System.out.printf("%d\n",-r(a, 0));
			}
			else
			{
				System.out.printf("%d\n",r(a, 0));
			}
		}
			return 0;
	}




}

