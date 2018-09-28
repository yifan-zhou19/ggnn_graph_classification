package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Integer.parseInt(tempVar);
		}
		for (i = 0;i < j;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				c = a;
				b = a;
			}
			else if (i >= 2)
			{
				if (b > a)
				{
					if (c < a)
					{
						c = a;
					}
					else if (c > a && c > b)
					{
						a = b;
						b = c;
						c = a;
					}
				}
				else if (b < a && c < b)
				{
				c = b;
				b = a;
				}
				else if (b < a && c >= b)
				{
					b = a;
				}
			}
			else if (b < a)
			{
			b = a;
			}
		}
		System.out.printf("%d\n", b);
		System.out.printf("%d", c);
		return 0;
	}
}

