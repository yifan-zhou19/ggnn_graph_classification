package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int n6;
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n1 = (sum - sum % 100) / 100;
		sum = sum % 100;
		n2 = (sum - sum % 50) / 50;
		sum = sum % 50;
		n3 = (sum - sum % 20) / 20;
		sum = sum % 20;
		n4 = (sum - sum % 10) / 10;
		sum = sum % 10;
		n5 = (sum - sum % 5) / 5;
		sum = sum % 5;
		n6 = sum % 5;
		System.out.print(n1);
		System.out.print("\n");
		System.out.print(n2);
		System.out.print("\n");
		System.out.print(n3);
		System.out.print("\n");
		System.out.print(n4);
		System.out.print("\n");
		System.out.print(n5);
		System.out.print("\n");
		System.out.print(n6);
		System.out.print("\n");
		return 0;


	}
}

