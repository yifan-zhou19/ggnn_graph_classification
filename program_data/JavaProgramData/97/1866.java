package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k1 = 0;
		int k2 = 0;
		int k3 = 0;
		int k4 = 0;
		int k5 = 0;
		int k6 = 0;
		int w;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k1 = n / 100;
		k2 = (n - 100 * k1) / 50;
		k3 = (n - 100 * k1 - 50 * k2) / 20;
		k4 = (n - 100 * k1 - 50 * k2 - 20 * k3) / 10;
		k5 = (n - 100 * k1 - 50 * k2 - 20 * k3 - 10 * k4) / 5;
		k6 = (n - 100 * k1 - 50 * k2 - 20 * k3 - 10 * k4 - 5 * k5);
		System.out.print(k1);
		System.out.print("\n");
		System.out.print(k2);
		System.out.print("\n");
		System.out.print(k3);
		System.out.print("\n");
		System.out.print(k4);
		System.out.print("\n");
		System.out.print(k5);
		System.out.print("\n");
		System.out.print(k6);
		System.out.print("\n");
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

