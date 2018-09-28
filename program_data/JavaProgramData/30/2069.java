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
		int i = 1;
		for (i = 1;i <= n;i++)
		{
			if ((int)i % 7 == 0 || (int)i / 10 == 7 || (int)i % 10 == 7)
			{
				continue;
			}

			result += i * i;
		}
			System.out.printf("%d",result);
			return 0;
	}

}

