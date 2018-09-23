package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		a = num / 1000;
		b = (num - a * 1000) / 100;
		c = (num - a * 1000 - b * 100) / 10;
		d = num - a * 1000 - b * 100 - c * 10;
		if (num == 10000)
		{
			System.out.print("1\n");
		}
		if (num > 999)
		{
		System.out.printf("%d%d%d%d\n",d,c,b,a);
		}
			else if (num > 99)
			{
				System.out.printf("%d%d%d\n",d,c,b);
			}
			else if (num > 9)
			{
				System.out.printf("%d%d\n",d,c);
			}
			else
			{
				System.out.printf("%d\n",d);
			}
			return 0;
	}
}

