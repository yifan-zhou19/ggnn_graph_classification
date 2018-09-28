package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int d;
		int e;
		int f = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= e;i++)
		{
			c = i / 10;
			d = i - c * 10;
			if (c != 0 && d != 0 && c % 7 != 0 && d % 7 != 0 && i % 7 != 0)
			{
				f = f + i * i;
			}
			else if (c == 0 && i % 7 != 0)
			{
				f = f + i * i;
			}
			else if (c != 0 && d == 0 && i % 7 != 0)
			{
				f = f + i * i;
			}
		}
		System.out.printf("%d\n",f);
		return 0;
	}
}

