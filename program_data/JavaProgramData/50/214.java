package <missing>;

public class GlobalMembers
{
	public static int f(int w,int m,int d)
	{
		int i;
		int x = d - 1;
		for (i = 1;i < m;i++)
		{
			if (i == 2)
			{
				x = x + 28;
			}
			else if (i < 8)
			{
				x = x + 30 + i % 2;
			}
			else
			{
				x = x + 31 - i % 2;
			}
		}
		x = (w + x % 7) % 7;
		return (x);
	}
	public static void Main()
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
			if (f(w, i, 13) == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
	}

}

