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
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: void gede(unsigned int i,unsigned int j)
	public static void gede(int i,int j)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int x,y,k,l;
		int x;
		int y;
		int k;
		int l;
		for (k = 3;k <= i / 2;k = k + 2)
		{
			l = i - k;
			int prove = int x;
			x = prove(k);
			y = prove(l);
			if (x == 1 && y == 1)
			{
				System.out.printf("%d=%d+%d\n",i,k,l);
				break;
			}
		}
	if (i < j - 1)
	{
		gede(i + 2, j);
	}
	}
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	gede(6, n);
	return (0);
	}
}

