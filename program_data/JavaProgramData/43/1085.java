package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (m / 2);i += 2)
		{
			a = i;
			for (j = 2;j < a;j++)
			{
				b = a % j;
				if (b == 0)
				{
					break;
				}
			}
			if (b == 0)
			{
				continue;
			}
			c = m - a;
			for (j = 2;j < c;j++)
			{
				b = c % j;
				if (b == 0)
				{
					break;
				}
			}
			if (b != 0)
			{
				System.out.printf("%d %d\n",a,c);
			}
		}
		return 0;
	}


}

