package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long a1, a2, a3, a4, a5, num;
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		if (num > 0 && num < 10)
		{
			System.out.printf("%ld", num);
		}
		else if (num < 100)
		{
			a1 = num / 10;
			a2 = num % 10;
			System.out.printf("%ld", 10 * a2 + a1);
		}
		else if (num < 1000)
		{
			a1 = num / 100;
			a2 = num / 10 - 10 * a1;
			a3 = num % 10;
			System.out.printf("%ld", a3 * 100 + a2 * 10 + a1);
		}
		else if (num < 10000)
		{
			a1 = num / 1000;
			a2 = num / 100 - 10 * a1;
			a3 = num / 10 - 10 * a2 - 100 * a1;
			a4 = num % 10;
			System.out.printf("%ld", a4 * 1000 + a3 * 100 + a2 * 10 + a1);
		}
		else
		{
			a1 = num / 10000;
			a2 = num / 1000 - 10 * a1;
			a3 = num / 100 - 10 * a2 - 100 * a1;
			a4 = num / 10 - 10 * a3 - 100 * a2 - 1000 * a1;
			a5 = num % 10;
			System.out.printf("%ld",10000 * a5 + 1000 * a4 + 100 * a3 + 10 * a2 + a1);
		}
		return 0;
	}

}

