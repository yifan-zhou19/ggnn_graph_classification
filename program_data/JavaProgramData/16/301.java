package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int v;
		int n4;
		int n3;
		int n2;
		int n1;
		double n0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else if (n == 10000)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			n0 = n;
			v = Math.log10(n0) + 1;
			n4 = n / 1000;
			n3 = (n - n4 * 1000) / 100;
			n2 = (n - n4 * 1000 - n3 * 100) / 10;
			n1 = n - n4 * 1000 - n3 * 100 - n2 * 10;
			switch (v)
			{
				case 4:
					System.out.print(n1);
					System.out.print(n2);
					System.out.print(n3);
					System.out.print(n4);
					System.out.print("\n");
					break;
				case 3:
					System.out.print(n1);
					System.out.print(n2);
					System.out.print(n3);
					System.out.print("\n");
					break;
				case 2:
					System.out.print(n1);
					System.out.print(n2);
					System.out.print("\n");
					break;
				case 1:
					System.out.print(n1);
					System.out.print("\n");
			}
		}
		return 0;
	}
}

