package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int t;
		int j;
		int y;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m,t = 0;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			for (y = 0,a = 0,b = i;b != 0;)
			{
				a = b % 10;
				b = b / 10;
				y = y * 10 + a;
			}
			if (j == i && y == i)
			{
				if (t == 0)
				{
					System.out.printf("%d",i);
					t++;
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		System.in.read();
		System.in.read();
	}
}

