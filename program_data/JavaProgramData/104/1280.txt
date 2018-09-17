package <missing>;

public class GlobalMembers
{
	public static int finder(int a,int b)
	{
		int c;
		for (;a != 0;a = a / 2)
		{
			for (c = b;c >= a;c = c / 2)
			{
				if (a == c)
				{
					System.out.printf("%d",c);
					return 0;
				}
			}
		}
	}

	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		finder(a, b);
		return 0;
	}
}

