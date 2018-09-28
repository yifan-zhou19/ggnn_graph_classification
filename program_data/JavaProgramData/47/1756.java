package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[100];
	public static void io(int num)
	{
		a[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num == 0)
		{
			io(1);
			System.out.print(a[0]);
		}
		else if (num == n - 1)
		{
			System.out.print(a[n - 1]);
			System.out.print(' ');
		}
		else
		{
			io(num + 1);
			System.out.print(a[num]);
			System.out.print(' ');
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		io(0);
		return 0;
	}

}

