package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[3];
		i = 3;
		a[0] = n % i;
		i = 5;
		a[1] = n % i;
		i = 7;
		a[2] = n % i;
		if (a[0] == 0 && a[1] != 0 && a[2] != 0)
		{
			System.out.print("3");
		}
		else if (a[0] == 0 && a[1] == 0 && a[2] != 0)
		{
			System.out.print("3 5");
		}
		else if (a[0] == 0 && a[1] == 0 && a[2] == 0)
		{
			System.out.print("3 5 7");
		}
		else if (a[0] != 0 && a[1] == 0 && a[2] == 0)
		{
			System.out.print("5 7");
		}
		else if (a[0] != 0 && a[1] == 0 && a[2] != 0)
		{
			System.out.print("5");
		}
		else if (a[0] != 0 && a[1] != 0 && a[2] == 0)
		{
			System.out.print("7");
		}
		else if (a[0] == 0 && a[1] != 0 && a[2] == 0)
		{
			System.out.print("3 7");
		}
		else
		{
			System.out.print("n");
		}

		return 0;
	}
}

