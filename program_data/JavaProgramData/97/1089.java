package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num1 = 0;
		int n1;
		int num2 = 0;
		int n2;
		int num3 = 0;
		int n3;
		int num4 = 0;
		int n4;
		int num5 = 0;
		int n5;
		int num6 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num1 = (n - n % 100) / 100;
		n1 = n % 100;
		System.out.print(num1);
		System.out.print("\n");
		num2 = (n1 - n1 % 50) / 50;
		n2 = n1 % 50;
		System.out.print(num2);
		System.out.print("\n");
		num3 = (n2 - n2 % 20) / 20;
		n3 = n2 % 20;
		System.out.print(num3);
		System.out.print("\n");
		num4 = (n3 - n3 % 10) / 10;
		n4 = n3 % 10;
		System.out.print(num4);
		System.out.print("\n");
		num5 = (n4 - n4 % 5) / 5;
		n5 = n4 % 5;
		System.out.print(num5);
		System.out.print("\n");
		num6 = n5;
		System.out.print(num6);
		System.out.print("\n");
		return 0;
	}
}

