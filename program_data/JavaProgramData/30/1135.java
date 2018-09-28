package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				s = s;
			}
			else if (i % 10 == 7)
			{
				s = s;
			}
			else if ((i - i % 10) / 10 == 7)
			{
				s = s;
			}
			else
			{
				s = s + i * i;
			}
		}
		System.out.printf("%d",s);
		return 0;
	}
}

