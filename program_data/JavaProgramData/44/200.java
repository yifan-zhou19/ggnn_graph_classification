package <missing>;

public class GlobalMembers
{
	public static int qiufan(int a)
	{
		int y = 0;
		int i = 0;
		int l = 0;
		int x;
		x = a;
		for (l = 0;x != 0;l++)
		{
			x = x / 10;
		}
		y = a % 10;
		x = a / 10;
		for (i = 1;i < l;i++)
		{
			y = y * 10 + x % 10;
			x = x / 10;
		}
		return (y);
	}

	public static int Main()
	{
		int a;
		int n;
		for (n = 1;n <= 6;n++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			if (a >= 0)
			{
				a = qiufan(a);
			}
			else
			{
				a = 0 - a;
				a = 0 - qiufan(a);
			}
			System.out.printf("%d\n",a);
		}
		return 0;
	}

}

