package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (c = 6;c <= a;c += 2)
		{
		for (i = 3;i <= c;i += 2)
		{
			for (b = 1,j = 3;j <= Math.sqrt(i);j += 2)
			{
				b = i % j;
				if (b == 0)
				{
					break;
				}
			}
			if (b != 0)
			{
				d = c - i;
				for (b = 1,j = 3;j <= Math.sqrt(d);j += 2)
				{
					b = d % j;
					if (b == 0)
					{
						break;
					}
				}
			}
			if (b != 0)
			{
				System.out.printf("%d=%d+%d\n",c,i,d);
				break;
			}
		}
		}
	}
}

