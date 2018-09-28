package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int x = int y;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 != 0 && x(i) == 0)
			{
				s = s + i * i;
			}
		}
		System.out.printf("%d\n",s);
	}
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static x(int y)
	{
		int a;
		int b;
		a = y % 10;
		b = (y - a) / 10;
		if (a == 7 || b == 7)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

