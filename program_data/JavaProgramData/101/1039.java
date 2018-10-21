package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int a;
	int b;
	int c;
	a = 3;
	b = 2;
	c = 1;
	if ((b > a) + (a == c) == 0 && (a > b) + (a > c) == 1 && (c > b) + (b > a) == 2)
	{
	System.out.print("CBA");
	System.out.print("\n");
	}
	a = 3;
	b = 1;
	c = 2;
	if ((b > a) + (a == c) == 0 && (a > b) + (a > c) == 2 && (c > b) + (b > a) == 1)
	{
	System.out.print("BCA");
	System.out.print("\n");
	}
	a = 2;
	b = 3;
	c = 1;
	if ((b > a) + (a == c) == 1 && (a > b) + (a > c) == 0 && (c > b) + (b > a) == 2)
	{
	System.out.print("CAB");
	System.out.print("\n");
	}
	a = 2;
	b = 1;
	c = 3;
	if ((b > a) + (a == c) == 1 && (a > b) + (a > c) == 2 && (c > b) + (b > a) == 0)
	{
	System.out.print("BAC");
	System.out.print("\n");
	}
	a = 1;
	b = 3;
	c = 2;
	if ((b > a) + (a == c) == 2 && (a > b) + (a > c) == 0 && (c > b) + (b > a) == 1)
	{
	System.out.print("ACB");
	System.out.print("\n");
	}
	a = 1;
	b = 2;
	c = 3;
	if ((b > a) + (a == c) == 2 && (a > b) + (a > c) == 1 && (c > b) + (b > a) == 0)
	{
	System.out.print("ABC");
	System.out.print("\n");
	}
	 return 0;

	}

}
