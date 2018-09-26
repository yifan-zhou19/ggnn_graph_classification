package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,k=6,i=3,j=3,a,b,x,y;
		int n;
		int k = 6;
		int i = 3;
		int j = 3;
		int a;
		int b;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = Math.sqrt(i);
		y = Math.sqrt(j);
		while (k <= n)
		{
			for (a = 3;a <= Math.sqrt(i);a += 2)
			{
		if (i % a == 0)
		{
			break;
		}
			}
		j = k - i;
		for (b = 3;b <= Math.sqrt(j);b += 2)
		{
		if (j % b == 0)
		{
			break;
		}
		}
		if (a > Math.sqrt(i) && b > Math.sqrt(j))
		{
			System.out.printf("%d=%d+%d\n",k,i,j);
			k += 2;
			i = 3;
		}
		else
		{
			i += 2;
		}
		}

	}
}

