package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
						if ((i % 7) == 0)
						{
								 continue;
						}
						if ((i % 10) == 7)
						{
								  continue;
						}
						if ((i / 10) == 7)
						{
									   continue;
						}
						sum += i * i;
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

