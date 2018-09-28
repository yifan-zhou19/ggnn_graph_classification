package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n; //???????
	int d3 = 0; //????????
	int d5 = 0;
	int d7 = 0;
	int d = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n % 3 == 0)
	{
		d3 = 1;
		d = d + 1;
	} //??d??????????
	if (n % 5 == 0)
	{
		d5 = 1;
		d = d + 2;
	}
	if (n % 7 == 0)
	{
		d7 = 1;
		d = d + 4;
	}
	if (d == 0)
	{
		System.out.print("n");
	}
	if (d == 1)
	{
		System.out.print("3");
	}
	if (d == 2)
	{
		System.out.print("5");
	}
	if (d == 4)
	{
		System.out.print("7");
	}
	if (d == 3)
	{
		System.out.print("3 5");
	}
	if (d == 5)
	{
		System.out.print("3 7");
	}
	if (d == 6)
	{
		System.out.print("5 7");
	}
	if (d == 7)
	{
		System.out.print("3 5 7");
	}
	return 0;
	}
}

