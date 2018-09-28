package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,f=0,x=0,y=0;
		int n;
		int f = 0;
		int x = 0;
		int y = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = 0;
		y = n;
		while (scanf("%d", n) != EOF)
		{

			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			 if (n >= x != 0 && n < y)
			 {
				x = n;
				f = 1;

			 }
			else if (n > y)
			{

				x = y;
				y = n;
				f = 1;

			}
			else if (c != ',')
			{
				break;
			}
			else
			{
				continue;
			}
		}
		if (f == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",x);
		}

		return 0;
	}
}

