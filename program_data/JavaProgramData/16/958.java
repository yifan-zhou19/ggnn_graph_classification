package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int b;
		char cc;
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = b % 10;
		b = b / 10;
		a[1] = b % 10;
		b = b / 10;
		a[2] = b % 10;
		b = b / 10;
		a[3] = b % 10;
		b = b / 10;
		if (a[3] != 0)
		{
			System.out.print(a[0]);
			System.out.print(a[1]);
			System.out.print(a[2]);
			System.out.print(a[3]);
		}
		else if (a[2] != 0)
		{
			System.out.print(a[0]);
			System.out.print(a[1]);
			System.out.print(a[2]);
		}
		else if (a[1] != 0)
		{
			System.out.print(a[0]);
			System.out.print(a[1]);
		}
		else
		{
			System.out.print(a[0]);
		}



		return 0;
	}


}

