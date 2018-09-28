package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int n;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			if (i % 10 == 7)
			{
				continue;
			}
			j = i;
			j = j / 10;
			if (j % 10 == 7)
			{
				continue;
			}
			s += i * i;

		}
		System.out.printf("%d",s);
		return 0;
	}
}

