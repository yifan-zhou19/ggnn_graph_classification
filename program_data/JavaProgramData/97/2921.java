package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(sum / 100);
		System.out.print("\n");
		sum = sum - (sum / 100) * 100;
		System.out.print(sum / 50);
		System.out.print("\n");
		sum = sum - (sum / 50) * 50;
		System.out.print(sum / 20);
		System.out.print("\n");
		sum = sum - (sum / 20) * 20;
		System.out.print(sum / 10);
		System.out.print("\n");
		sum = sum - (sum / 10) * 10;
			System.out.print(sum / 5);
			System.out.print("\n");
		sum = sum - (sum / 5) * 5;
		System.out.print(sum);

		return 0;
	}

}

