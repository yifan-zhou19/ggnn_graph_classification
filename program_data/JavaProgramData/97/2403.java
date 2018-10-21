package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int sum;
	int n100;
	int n50;
	int n20;
	int n10;
	int n5;
	int n1;
	//????
	sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	//?????
	n100 = sum / 100;

	sum = sum - n100 * 100;
	n50 = sum / 50;

	sum = sum - n50 * 50;
	n20 = sum / 20;

	sum = sum - n20 * 20;
	n10 = sum / 10;

	sum = sum - n10 * 10;
	n5 = sum / 5;

	sum = sum - n5 * 5;
	n1 = sum;
	//????
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
	//??
	return 0;
	}

}

