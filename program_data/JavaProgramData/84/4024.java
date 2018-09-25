package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ma;
		int mi;
		int x;
		int y;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		while (i <= y)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (i == 1)
			{
				ma = n;
			}
			else if (i == 2)
			{
				if (n >= ma)
				{
				x = ma;
				ma = n;
				mi = x;
				}
				else
				{
					mi = n;
				}
			}
			else if (n >= ma)
			{
				x = ma;
				ma = n;
				mi = x;
			}
			else if (n >= mi)
			{
				mi = n;
			}
		i++;
		}
		System.out.printf("%d\n%d\n",ma,mi);
		return 0;
	}
}

