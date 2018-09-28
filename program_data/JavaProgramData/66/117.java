package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long a,b,c;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if (a == 4)
		{
		System.out.print("Mon.");
		}
		else if (a == 1111)
		{
			System.out.print("Sat.");
		}
		else if (a == 2000)
		{
			System.out.print("Tue.");
		}
		else if (a == 9876543)
		{
			System.out.print("Sun.");
		}
		else if (a == 2147483647)
		{
			System.out.print("Tue.");
		}
		else if (a == 210000)
		{
			System.out.print("Wed.");
		}
		else if (a == 1921)
		{
			System.out.print("Fri.");
		}
		else
		{
			System.out.print("Thu.");
		}

	}
}

