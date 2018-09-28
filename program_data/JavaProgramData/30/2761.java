package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n > 0;n--)
		{
			if (!(n % 7 == 0 || n % 10 == 7 || (9 >= n - 70 && n - 70 >= 0)))
			{
				result += n * n;
			}
		}
		System.out.printf("%d",result);
		return 0;
	}

}

