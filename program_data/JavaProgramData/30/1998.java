package <missing>;

public class GlobalMembers
{
		public static int wuSeven(int a)
		{
			if (a % 7 == 0)
			{
				return 0;
			}
			for (int num = a;num > 0;num = num / 10)
			{
				if (num % 10 == 7)
				{
					return 0;
				}
			}
			return 1;
		}

	public static int Main()
	{
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			if (wuSeven(i) != 0)
			{
				sum = sum + i * i;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}


}

