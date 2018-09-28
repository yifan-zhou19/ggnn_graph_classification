package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long a,b,c,d,x,y,z;
	 int a;
	 int b;
	 int c;
	 int d;
	 int x;
	 int y;
	 int z;
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
	 {
		if ((a % 4 == 0 && a % 100 != 0 || a % 400 == 0))
		{
			x = 1;
		}
		else
		{
			x = 0; // x????1,???0
		}
	 if (b == 1)
	 {
		 d = c;
	 }
	 else if (b == 2)
	 {
		 d = c + 31;
	 }
	 else if (b == 3)
	 {
		 d = c + 31 + 28 + x;
	 }
	 else if (b == 4)
	 {
		 d = c + 31 + 28 + 31 + x;
	 }
	 else if (b == 5)
	 {
		 d = c + 31 + 28 + 31 + 30 + x;
	 }
	 else if (b == 6)
	 {
		 d = c + 31 + 28 + 31 + 30 + 31 + x;
	 }
	 else if (b == 7)
	 {
		 d = c + 31 + 28 + 31 + 30 + 31 + 30 + x;
	 }
	 else if (b == 8)
	 {
		 d = c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + x;
	 }
	 else if (b == 9)
	 {
		 d = c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + x;
	 }
	 else if (b == 10)
	 {
		 d = c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + x;
	 }
	 else if (b == 11)
	 {
		 d = c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + x;
	 }
	 else if (b == 12)
	 {
		 d = c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + x; // d???????????
	 }
	 y = (a - 1) * 1 + (a - 1) / 4 - ((a / 100) - (a / 400)) + d;
	/* y???????????*/
	 z = y % 7;
	if (z == 0)
	{
		System.out.print("Sun.");
	}
	else if (z == 1)
	{
		System.out.print("Mon.");
	}
	else if (z == 2)
	{
		System.out.print("Tue.");
	}
	else if (z == 3)
	{
		System.out.print("Wed.");
	}
	else if (z == 4)
	{
		System.out.print("Thu.");
	}
	else if (z == 5)
	{
		System.out.print("Fri.");
	}
	else if (z == 6)
	{
		System.out.print("Sat.");
	}
}

	}

}

