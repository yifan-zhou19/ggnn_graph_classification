package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: int Isprimenumber(unsigned short int a)
	public static int Isprimenumber(short a)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned short int b;
		short b;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned short int x;
		short x;
		x = (int)Math.sqrt(a) + 1;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: for(unsigned short int i=2;i<=x;i++)
		for (short i = 2;i <= x;i++)
		{
			b = a % i;
			if (b == 0)
			{
				break;
			}
		}
		if (b != 0)
		{
			return 1;
		}
	}




	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned short int n;
		short n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Short.parseShort(tempVar);
		}
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: for(unsigned short int j=6;j<=n;j++)
		for (short j = 6;j <= n;j++)
		{
			if (j % 2 != 0)
			{
				continue;
			}
			else
			{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned short p;
				short p;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned short q;
				short q;
				for (p = 3;p < j;p++)
				{
					q = j - p;
					if (Isprimenumber(p) == 1 && Isprimenumber(q) == 1)
					{
						break;
					}
				}
				System.out.printf("%d=%d+%d",j,p,q);
				System.out.print("\n");
			}
		}
	}
}

