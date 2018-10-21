package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int a;
	 int b;
	 int c;
	 int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		d = Integer.parseInt(tempVar);
	}
	 a = 3;
	 b = 5;
	 c = 7;
	if (d % 3 == 0 && d % 5 == 0 && d % 7 == 0)
	{
		System.out.printf("%d %d %d",a,b,c);
	}
	else if (d % 3 != 0 && d % 5 != 0 && d % 7 != 0)
	{
		System.out.print("n");
	}
	else if (d % 3 == 0 && d % 5 != 0 && d % 7 != 0)
	{
		 System.out.printf("%d",a);
	}
	else if (d % 3 != 0 && d % 5 == 0 && d % 7 != 0)
	{
		 System.out.printf("%d",b);
	}
	else if (d % 3 != 0 && d % 5 != 0 && d % 7 == 0)
	{
		 System.out.printf("%d",c);
	}
	else if (d % 3 == 0 && d % 5 == 0 && d % 7 != 0)
	{
		 System.out.printf("%d %d",a,b);
	}
	else if (d % 3 == 0 && d % 5 != 0 && d % 7 == 0)
	{
		 System.out.printf("%d %d",a,c);
	}
	else if (d % 3 != 0 && d % 5 == 0 && d % 7 == 0)
	{
		 System.out.printf("%d %d",b,c);
	}
	}

}

