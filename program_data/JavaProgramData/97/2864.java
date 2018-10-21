package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int a; //???a,n
		int n;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = a / 100; //???????
		System.out.print(n);
		System.out.print("\n");
		a = a - n * 100;
		n = a / 50;
		System.out.print(n);
		System.out.print("\n");
		a = a - n * 50;
		n = a / 20;
		System.out.print(n);
		System.out.print("\n");
		a = a - n * 20;
		n = a / 10;
		System.out.print(n);
		System.out.print("\n");
		a = a - n * 10;
		n = a / 5;
		System.out.print(n);
		System.out.print("\n");
		a = a - n * 5;
		System.out.print(a);
		return 0; //?????
	}
}

