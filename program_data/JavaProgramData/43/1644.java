package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int panduan = int x;
		int m;
		int i;
		int j;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i = i + 2)
		{
			j = m - i;
			a = panduan(i);
			b = panduan(j);
			if ((a == 1) && (b == 1))
			{
				System.out.printf("%d %d\n",i,j);
			}
		}
		return 0;
	}
	public static int panduan(int x)
	{
		int i;
		for (i = 3;i < x / 2;i++)
		{
			if (x % i == 0)
			{
				return (0);
				break;
			}
		}
		return (1);
	}
}

