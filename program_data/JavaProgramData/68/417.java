package <missing>;

public class GlobalMembers
{
	public static int work(int n)
	{
		int i;
		int sqr;
		sqr = (int)Math.sqrt(n);
		//if(n==2) return 1;
		for (i = 2;i <= sqr + 1;i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int num,n;
		int num;
		int n;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a,b;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (n = 6;n <= num;n += 2)
		{
			 System.out.printf("%ld=",n);
			 for (a = 2;a < n;a++)
			 {
				  if (work(a) != 0)
				  {
					b = n - a;
					if (work(b) != 0)
					{
						System.out.printf("%ld+%ld",a,b);
						break;
					}
				  }
			 }
				System.out.print("\n");
		}

		return 1;
	}



}

