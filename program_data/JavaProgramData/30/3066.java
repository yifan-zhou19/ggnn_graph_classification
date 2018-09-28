package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int he;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		he = 0;
		for (i = 1;i <= n;i++)
		{
			a = i / 10;
			b = i - a * 10;
			c = i - (i / 7) * 7;
			if ((a != 7) && (b != 7) && (c != 0))
			{
			he = he + i * i;
			}
		}

		System.out.printf("%d",he);
	}
}

