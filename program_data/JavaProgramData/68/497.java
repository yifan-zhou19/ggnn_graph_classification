package <missing>;

public class GlobalMembers
{
	public static int prove(int x)
	{
	int y = 1;
	int i;
	if (x % 2 == 0)
	{
		y = 0;
	}
	else
	{
	for (i = 3;i <= Math.sqrt(x);i++)
	{
			if (x % i == 0)
			{
				y = 0;
			}
	}
	}
	return (y);
	}
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,l,x,y;
	int n;
	int l;
	int x;
	int y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,k,p;
	int i;
	int k;
	int p;
	for (i = 6;i <= n;i = i + 2)
	{
			p = 0;
		for (k = 3;k <= i / 2;k = k + 2)
		{
			if (p == 1)
			{
				continue;
			}
			else
			{
				l = i - k;
			}
			int prove = int x;
			x = prove(k);
			y = prove(l);
			if (x == 1 && y == 1)
			{
					p = 1;
				System.out.printf("%d=%d+%d\n",i,k,l);
			}
			else
			{
				p = 0;
			}
		}
	}
	return (0);
	}

}

