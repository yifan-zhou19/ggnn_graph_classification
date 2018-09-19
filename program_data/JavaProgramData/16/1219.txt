package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = n / 1000;
		a[1] = (n - a[0] * 1000) / 100;
		a[2] = (n - a[0] * 1000 - a[1] * 100) / 10;
		a[3] = n % 10;
		if (a[0] == 0)
		{
			if (a[1] == 0)
			{
				if (a[2] == 0)
				{
					System.out.print(a[3]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(a[3]);
					System.out.print(a[2]);
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print(a[3]);
				System.out.print(a[2]);
				System.out.print(a[1]);
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print(a[3]);
			System.out.print(a[2]);
			System.out.print(a[1]);
			System.out.print(a[0]);
			System.out.print("\n");
		}

	return 0;

	}

}

