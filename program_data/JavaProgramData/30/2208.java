package <missing>;

public class GlobalMembers
{
	public static int yu7wuguan(int e)
	{
		if (e % 7 == 0)
		{
			return 0;
		}
		while (e / 10 >= 0 && e > 0)
		{
			int i;
			i = e % 10;
			if (i == 7)
			{
				return 0;
			}
			e /= 10;
		}
		return 1;
	}


	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int result;
		result = 0;
		for (i = 1;i <= n;i++)
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

