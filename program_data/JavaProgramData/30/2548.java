package <missing>;

public class GlobalMembers
{
	public static int yu7wuguan(int n)
	{
		if (n % 7 == 0)
		{
			return 0;
		}
		if (n == 71 || n == 72 || n == 73 || n == 74 || n == 75 || n == 76 || n == 78 || n == 79)
		{
			return 0;
		}
			if (n % 10 == 7)
			{
				return 0;
			}
		return 1;
	}
	public static int Main()
	{
		int result = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			if (yu7wuguan(i) != 0)
			{
				result += i * i;
			}
		}
		System.out.printf("%d",result);
		return 0;
	}
}

