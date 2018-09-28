package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int k;
		int r;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (r = 1;r < 1000000;r++)
		{
			m = r * (n - 1);
			for (i = 1;i <= n;i++)
			{
				if (m % (n - 1) == 0)
				{
					m = m * n / (n - 1) + k;
				}
				else
				{
					break;
				}
				if (i == n)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	  end:
		System.out.printf("%d",m);
		return 0;
	}
}

