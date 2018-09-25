package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????a?b?c
		int a;
		int b;
		int c;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a = n % 3; //a?n??3???
	b = n % 5; //b?n??5???
	c = n % 7; //c?n??7???
	if (a == 0 && b == 0 && c == 0)
	{
		System.out.print("3");
		System.out.print(" ");
		System.out.print("5");
		System.out.print(" ");
		System.out.print("7");
	}
	else if (a == 0 && b == 0 && c != 0)
	{
		System.out.print("3");
		System.out.print(" ");
		System.out.print("5");
	}
	else if (a == 0 && b != 0 && c == 0)
	{
		System.out.print("3");
		System.out.print(" ");
		System.out.print("7");
	}
	else if (a != 0 && b == 0 && c == 0)
	{
		System.out.print("5");
		System.out.print(" ");
		System.out.print("7");
	}
	else if (a == 0 && b != 0 && c != 0)
	{
		System.out.print("3");
	}
	else if (a != 0 && b == 0 && c != 0)
	{
		System.out.print("5");
	}
	else if (a != 0 && b != 0 && c == 0)
	{
		System.out.print("7");
	}
	else if (a != 0 && b != 0 && c != 0)
	{
		System.out.print("n");
	}
	return 0;
	}


}

