package <missing>;

public class GlobalMembers
{
	public static int yu7wuguan(int num)
	{
		if (num % 7 == 0)
		{
			return 0;
		}
		for (int n = num;n > 0;n /= 10)
		{
			if (n % 10 == 7)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		int i;
		int x;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (yu7wuguan(i) != 0)
			{
				s += i * i;
			}
		}
		System.out.printf("%d",s);
		return 0;
	}

}

