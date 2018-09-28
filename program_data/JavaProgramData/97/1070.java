package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n100 = 0; //?????????????
		int n50 = 0;
		int n20 = 0;
		int n10 = 0;
		int n5 = 0;
		int n1 = 0;
		int n = 0; //?????
		int p = 0; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = n % 100;
		n100 = (n - p) / 100;
		n = p % 50;
		n50 = (p - n) / 50;
		p = n % 20;
		n20 = (n - p) / 20;
		n = p % 10;
		n10 = (p - n) / 10;
		p = n % 5;
		n5 = (n - p) / 5;
		n1 = p;
		System.out.print(n100);
		System.out.print("\n");
		System.out.print(n50);
		System.out.print("\n");
		System.out.print(n20);
		System.out.print("\n");
		System.out.print(n10);
		System.out.print("\n");
		System.out.print(n5);
		System.out.print("\n");
		System.out.print(n1);
		System.out.print("\n");
		return 0;


	}
}

