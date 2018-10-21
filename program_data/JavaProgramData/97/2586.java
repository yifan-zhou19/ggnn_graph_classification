package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int p;
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = sum / 100;
		System.out.print(p);
		System.out.print("\n");
		sum = sum - 100 * p;
		p = sum / 50;
		System.out.print(p);
		System.out.print("\n");
		sum = sum - 50 * p;
		p = sum / 20;
		System.out.print(p);
		System.out.print("\n");
		sum = sum - 20 * p;
		p = sum / 10;
		System.out.print(p);
		System.out.print("\n");
		sum = sum - 10 * p;
		p = sum / 5;
		System.out.print(p);
		System.out.print("\n");
		sum = sum - 5 * p;
		p = sum / 1;
		System.out.print(p);
		System.out.print("\n");
		return 0;

	}
}

