package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int b;
		int c;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = 0;
		c = 0;
		do
		{
			int a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a > b)
			{
				c = b;
				b = a;
			}
			else
			{
				if (a > c)
				{
					c = a;
					b = b;
				}
				else
				{
					c = c;
					b = b;
				}
			}
			i = i + 1;
		} while (i <= n);
		System.out.printf("%d\n%d",b,c);
	}


}

