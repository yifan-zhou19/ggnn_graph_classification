package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f;
		int i;
		int num;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= num;i++)
		{
			if (i % 7 == 0)
			{
				f = 0;
			}
			else if (i % 10 == 7)
			{
				f = 0;
			}
			else if (i / 10 == 7)
			{
				f = 0;
			}
			else
			{
				f = i;
			}
			sum += f * f;
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
}

