package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a = i;
			b = i % 10;
			i = i / 10;
			c = i % 10;
			i = i / 10;
			d = i % 10;
			if ((a % 7 != 0) && (b != 7) && (c != 7) && (d != 7))
			{
				sum += a * a;
			}
			i = a;
		}
		System.out.printf("%d",sum);
	}


}

