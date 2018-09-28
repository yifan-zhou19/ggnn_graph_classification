package <missing>;

public class GlobalMembers
{
	public static int yue(int a)
	{
		if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12)
		{
			return 31;
		}
		else if (a == 2)
		{
			return 28;
		}
		else
		{
			return 30;
		}
	}
	public static int Main()
	{
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			if (w == 7)
			{
				System.out.printf("%d\n",i);
			}
			w += yue(i) % 7;
			if (w > 7)
			{
				w -= 7;
			}
		}
		return 0;
	}
}

