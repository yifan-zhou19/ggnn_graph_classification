package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int max = 1;
		int t = 1;
		int a;
		int b;
		int x;
		int y;
		int o;
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
		while (1 == 1)
		{
			o = 0;
			x = t;
			for (i = 1;i <= n;i++)
			{
				y = x;
				a = x / n;
				b = x - a * n;
				if (b != k)
				{
					o = 1;
					break;
				}
				else
				{
					x = y - b - a;
				}
			}
			if (o == 0 && a >= 1)
			{
				System.out.printf("%d",t);
				break;
			}
			else
			{
				t = t + 1;
			}
		}
		return 0;
	}
}

