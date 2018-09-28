package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int x100 = 0;
		int x50 = 0;
		int x20 = 0;
		int x10 = 0;
		int x5 = 0;
		int x1 = 0;
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x100 = sum / 100;
		sum = sum - 100 * x100;
		x50 = sum / 50;
		sum = sum - 50 * x50;
		x20 = sum / 20;
		sum = sum - 20 * x20;
		x10 = sum / 10;
		sum = sum - 10 * x10;
		x5 = sum / 5;
		sum = sum - 5 * x5;
		x1 = sum / 1;
		sum = sum - 1 * x1;
		System.out.print(x100);
		System.out.print("\n");
		System.out.print(x50);
		System.out.print("\n");
		System.out.print(x20);
		System.out.print("\n");
		System.out.print(x10);
		System.out.print("\n");
		System.out.print(x5);
		System.out.print("\n");
		System.out.print(x1);
		System.out.print("\n");


		System.in.read();
		System.in.read();
		return 0;
	}
}

