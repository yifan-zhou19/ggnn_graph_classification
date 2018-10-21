package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = n;i > 0;i--)
		{
		if (i / 10 != 7)
		{
			if (i - (i / 10) * 10 != 7)
			{
				if (i % 7 != 0)
				{
				   m = m + i * i;
				}
			}
		}
		}
		System.out.printf("%d",m);
		return 0;
	}

}

