package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int s;
		int x;
		int i;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
		if (x >= s)
		{
				   t = s;
				   s = x;
		}
			else if (x > t)
			{
				t = x;
			}
		}
		System.out.printf("%d\n", s);
		System.out.printf("%d", t);
			return 0;
	}
}

