package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		int b;
		int c = 0;
		int j = 0;
		int k;
		int d = 0;
		int i;
		b = a;
		while (b != 0)
		{
			b = b / 10;
			j++;
		}
		for (i = 1;i <= j;i++)
		{
			c = a % 10;
			for (k = i;k < j;k++)
			{
				c = c * 10;
			}
			d = d + c;
			a = a / 10;
		}
		return d;
	}
	public static int Main()
	{
		int i;
		int m;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",f(m));
		}
		return 0;
	}

}

