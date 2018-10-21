package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n = 0;
		int b;
		int i;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a;
		while (a >= 1)
		{
			a = a / 10;
			n = n + 1;
		}
		for (i = 0;i < n;i++)
		{
			c = b % 10;
			System.out.printf("%d",c);
			b = (b - b % 10) / 10;
		}
	}
}

