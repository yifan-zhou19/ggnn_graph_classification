package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int a6;
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a1 = sum / 100;
		sum = sum - a1 * 100;
		a2 = sum / 50;
		sum = sum - a2 * 50;
		a3 = sum / 20;
		sum = sum - a3 * 20;
		a4 = sum / 10;
		sum = sum - a4 * 10;
		a5 = sum / 5;
		sum = sum - a5 * 5;
		a6 = sum / 1;
		System.out.print(a1);
		System.out.print('\n');
		System.out.print(a2);
		System.out.print('\n');
		System.out.print(a3);
		System.out.print('\n');
		System.out.print(a4);
		System.out.print('\n');
		System.out.print(a5);
		System.out.print('\n');
		System.out.print(a6);
		return 0;
	}
}

