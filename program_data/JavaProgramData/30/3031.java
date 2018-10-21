package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int x;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0;
		for (i = 1;i <= n;i++)
		{
			x = i / 10;
			if (i % 7 == 0 || x == 7 || i - (x * 10) == 7)
			{
				;
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

