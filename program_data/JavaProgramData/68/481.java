package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = 6;
		int b = 3;
		int c;
		int d;
		int e;
		int f;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 6;a <= n;a = a + 2)
		{
			for (b = 3;b <= a;b = b + 2)
			{
				c = (int)(Math.sqrt(b));
				for (d = 2;d <= c;d++)
				{
					if (b % d == 0)
					{
						break;
					}
				}
				if (d >= c + 1)
				{
				 f = a - b;
				 e = (int)(Math.sqrt(f));
				 for (d = 2;d <= e;d = d++)
				 {
					if (f % d == 0)
					{
						break;
					}
				 }
				}
			if (d >= e+1)
			{
				break;
			}
			}
			System.out.printf("%d=%d+%d\n",a,b,f);
		}
	}
}

