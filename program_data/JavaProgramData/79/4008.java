package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int y = 0;
		int h;
		int x = 1;
		for (h = 1;h <= 20;h++)

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
		if (m != 0 && n >= 2)

		{
		for (i = 2;i <= n;i++)
		{
		y = (y + m) % i;
		}
		System.out.printf("%d\n",y + 1);
		y = 0;
		}
		else if (n == 1)
		{
		System.out.printf("%d\n",x);
		}
		else if (m == 0 && n == 0)
		{
		break;
		}
		}

	}

}

