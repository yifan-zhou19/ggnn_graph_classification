package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[4];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n / 10 == 0)
		{
			a[0] = n;
			System.out.print(a[0]);
			System.out.print("\n");
		}
		else if (n / 100 == 0)
		{
			a[0] = n / 10;
			a[1] = n % 10;
			System.out.print(a[1]);
			System.out.print(a[0]);
			System.out.print("\n");
		}
		else if (n / 1000 == 0)
		{
			a[0] = n / 100;
			a[1] = n % 100 / 10;
			a[2] = n % 100 % 10;
			System.out.print(a[2]);
			System.out.print(a[1]);
			System.out.print(a[0]);
			System.out.print("\n");
		}
		else if (n / 10000 == 0)
		{
			a[0] = n / 1000;
			a[1] = n % 1000 / 100;
			a[2] = n % 1000 % 100 / 10;
			a[3] = n % 1000 % 100 % 10;
			System.out.print(a[3]);
			System.out.print(a[2]);
			System.out.print(a[1]);
			System.out.print(a[0]);
			System.out.print("\n");
		}
		else if (n = 10000)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		return 0;
	}
}

