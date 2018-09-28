package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num1;
		int num5;
		int num10;
		int num20;
		int num50;
		int num100;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num100 = n / 100; //100???
		num50 = (n - num100 * 100) / 50; //50???
		num20 = (n - num100 * 100 - num50 * 50) / 20; //20???
		num10 = (n - num100 * 100 - num50 * 50 - num20 * 20) / 10; //10???
		num5 = (n - num100 * 100 - num50 * 50 - num20 * 20 - num10 * 10) / 5; //5???
		num1 = (n - num100 * 100 - num50 * 50 - num20 * 20 - num10 * 10 - num5 * 5) / 1; //1???
		System.out.print(num100);
		System.out.print("\n");
		System.out.print(num50);
		System.out.print("\n");
		System.out.print(num20);
		System.out.print("\n");
		System.out.print(num10);
		System.out.print("\n");
		System.out.print(num5);
		System.out.print("\n");
		System.out.print(num1);
		System.out.print("\n");
		return 0;
	}

}

