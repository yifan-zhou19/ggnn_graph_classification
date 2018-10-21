package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		if ((i % 7 == 0) || (i % 10 == 7) || (i / 10 % 10 == 7))
		{
			continue;
		}
		else
		{
			sum = sum + Math.pow(i,2);
		}
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

