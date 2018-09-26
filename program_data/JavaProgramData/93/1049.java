package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int b;
		int c;
		a = n % 3;
		b = n % 5;
		c = n % 7; //??n??3?5?7???
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.print("3 5 7");
		}
		if (a == 0 && b == 0 && c != 0)
		{
			System.out.print("3 5");
		}
		if (a == 0 && b != 0 && c == 0)
		{
			System.out.print("3 7");
		}
		if (a == 0 && b != 0 && c != 0)
		{
			System.out.print("3");
		}
		if (a != 0 && b == 0 && c == 0)
		{
			System.out.print("5 7");
		}
		if (a != 0 && b == 0 && c != 0)
		{
			System.out.print("5");
		}
		if (a != 0 && b != 0 && c == 0)
		{
			System.out.print("7");
		}
		if (a != 0 && b != 0 && c != 0)
		{
			System.out.print("n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

