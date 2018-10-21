package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char t;
		int i;
		int k;
		int m;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = 0;
		m = 0;
		while (scanf(",%d", i))
		{
			if (i > a)
			{
				b = a;
				a = i;
				m = 0;
			}
			if (i == a)
			{
				m = 1;
			}
			if (i < a && i> b)
			{
			  b = i;
			}

		}
		if (b == 0)
		{
			System.out.print("No");
		}
		if (b > 0)
		{
			System.out.printf("%d",b);
		}

	}
}

