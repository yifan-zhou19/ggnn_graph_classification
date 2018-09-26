package <missing>;

public class GlobalMembers
{
	public static int w(int m)
	{
	int d = 2;
	int e = 1;
	for (;d <= Math.sqrt(m);d = d + 1)
	{
		if (m % 2 == 0)
		{
				e = 0;
			break;
		}
		if (m % d == 0)
		{
				e = 0;
			break;
		}
	}
	return (e);
	}
	public static void Main()
	{
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	int b = 2;
	int c = 6;
	for (;c <= a;c += 2)
	{
		b = 2;
			for (;b < c;b++)
			{
				if (w(b) != 0 && w(c - b) != 0 && (c - b) != 2)
				{
						System.out.printf("%d=%d+%d\n",c,b,c - b);
					break;
				}
			}
	}

	}
}

