package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int x = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
		if (m == 0 && n == 0)
		{
			break;
		}
		x = 1;
		for (i = 2;i <= n;i++)
		{
			x = (x + m) % i;
			if (x == 0)
			{
				x = x + i;
			}
		}
		System.out.printf("%d\n",x);
		} while (0 == 0);
		return 0;
	}

}

