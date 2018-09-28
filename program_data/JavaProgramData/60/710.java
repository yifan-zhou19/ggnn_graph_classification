package <missing>;

public class GlobalMembers
{
	public static int func(int a,int b)
	{
		int i;
		int flag = 1;
		for (i = 2;i <= Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
				flag = 0;
				break;
			}
		}
		for (i = 2;i <= Math.sqrt(b);i++)
		{
			if (b % i == 0)
			{
				flag = 0;
				 break;
			}
		}
		return flag;
	}

	public static int Main()
	{
		int sum = 0;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n - 2;)
		{
			if (i == 1)
			{
				i = i + 2;
				continue;
			}
			if (func(i, i + 2) == 1)
			{
				sum++;
				System.out.printf("%d %d\n",i,i + 2);
			}
			i = i + 2;
		}
		if (sum == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}

}

