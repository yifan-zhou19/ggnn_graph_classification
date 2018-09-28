package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int e = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		for (int d = 1;d <= n;d++)
		{
			b = d % 10;
			c = (d - b) / 10;
			if (d % 7 == 0 || b == 7 || c == 7)
			{
				e = 0;
			}
			else
			{
				e = d * d;
			}
			a = a + e;
		}
		System.out.printf("%d",a);
		return 0;
	}
}

