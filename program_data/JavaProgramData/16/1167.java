package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[5];
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = n / 1000;
		a[1] = (n - 1000 * a[0]) / 100;
		a[2] = (n - 1000 * a[0] - 100 * a[1]) / 10;
		a[3] = n - 1000 * a[0] - 100 * a[1] - 10 * a[2]; //?????
		if (n >= 1000)
		{
			System.out.print(a[3]);
			System.out.print(a[2]);
			System.out.print(a[1]);
			System.out.print(a[0]);
		}
		else if (n >= 100 && n < 1000) //??????????
		{
			System.out.print(a[3]);
			System.out.print(a[2]);
			System.out.print(a[1]);
		}
		else if (n >= 10 && n < 100)
		{
			System.out.print(a[3]);
			System.out.print(a[2]);
		}
		else if (n < 10)
		{
		System.out.print(n);
		}
		return 0;
	}

}

