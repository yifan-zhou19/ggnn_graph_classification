package <missing>;

public class GlobalMembers
{
	public static int panduan(int n)
	{
		int f = 1;
		int i;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
		if (n % i == 0)
		{
			f = 0;
			break;
		}
		}
		return f;
	}
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,i,j;
		int n;
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i += 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
			if (panduan(j) != 0)
			{
				if (panduan(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
				  break;
				}
			}
			}
		}
	}

}

