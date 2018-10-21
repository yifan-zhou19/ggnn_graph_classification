package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int[] a = new int[6];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = n / 100;
		n = n - a[0] * 100;
		a[1] = n / 50;
		n = n - a[1] * 50;
		a[2] = n / 20;
		n = n - 20 * a[2];
		a[3] = n / 10;
		n = n - 10 * a[3];
		a[4] = n / 5;
		n = n - 5 * a[4];
		a[5] = n / 1;
		for (i = 0;i < 6;i++)
		{
		System.out.print(a[i]);
		System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

