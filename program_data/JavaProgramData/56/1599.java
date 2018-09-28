package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long a;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = (a / 10000) % 10;
		c = (a / 1000) % 10;
			d = (a / 100) % 10;
			e = (a / 10) % 10;
			f = a % 10;

			if (a > 10000)
			{
				System.out.printf("%d%d%d%d%d\n",f,e,d,c,b);
			}
			else if (1000 < a && a < 10000)
			{
				System.out.printf("%d%d%d%d\n",f,e,d,c);
			}
			else if (100 < a && a < 1000)
			{
				System.out.printf("%d%d%d\n",f,e,d);
			}
			else if (10 < a && a < 100)
			{
				System.out.printf("%d%d\n",f,e);
			}
			else
			{
				System.out.printf("%d\n",f);
			}
	}
}

