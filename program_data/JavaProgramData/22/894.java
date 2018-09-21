package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		b = 0;
		c = 0;
		i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (System.in.read() != EOF)
		{
			if (a > b)
			{
				c = b;
				b = a;
			}
			else if (a == b)
			{
				b = a;
			}
			else
			{
				if (c <= a)
				{
					c = a;
				}
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			i++;
		}
		if (b == c || i == 1 || c == 0)
		{
		System.out.print("\nNo");
		}
		else
		{
			System.out.printf("\n%d",c);
		}
		return 0;
	}


}

