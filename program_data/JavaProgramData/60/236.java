package <missing>;

public class GlobalMembers
{
	public static int find(int x)
	{
		int i;
		int BL = 1;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				BL = 0;
			}
		}
		return BL;
	}
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int i;
		int BL;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i += 2)
		{
			BL = 0;
			if (find(i) != 0)
			{
				if (a < b)
				{
					a = i;
				}
				else
				{
					b = i;
				}
				BL = 1;
			}
			if (a - b == 2 && BL != 0)
			{
				System.out.printf("%d %d\n",b,a);
				c = 1;
			}
			else
			{
				if (b - a == 2 && BL != 0)
				{
					System.out.printf("%d %d\n",a,b);
					c = 1;
				}
			}
		}
		if (c == 0)
		{
			System.out.print("empty\n");
		}
	}
}

