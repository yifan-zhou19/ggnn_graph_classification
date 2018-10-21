package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i / 10 == 7)
			{
				;
			}
			else
			{
				if (i % 10 == 7)
				{
					;
				}
				else
				{
				if (i % 7 == 0)
				{
					;
				}
				else
				{
					s = s + i * i;
				}
				}
			}

		}
		System.out.printf("%d",s);
		return 0;
	}
}

