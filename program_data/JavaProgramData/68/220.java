package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int prime = int;
		int i;
		int n;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (h = 6;h < (n + 1);h = h + 2)
		{
			for (i = 3;i <= (h / 2);i++)
			{
			if (prime(i) == 1 && prime(h - i) == 1)
			{
				System.out.printf("%d=%d+%d\n",h,i,h - i);
			break;
			}
			}
		}
		return 0;
	}

		public static int prime(int n)
		{
			int i;
			int flag = 1;
		for (i = 2;i * i <= n != 0 && flag == 1;i++)
		{
			if (n % i == 0)
			{
		flag = 0;
			}
		}
		return (flag);
		}
}

