package <missing>;

public class GlobalMembers
{
	//********************************
	//*???1.???? **
	//*?????? 1300017623 **
	//*???2013.12.11  **
	//********************************
	public static int Main()
	{
		int[] a = new int[100];
		int[] p = a;
		int n;
		int m;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = a; p <= a[n - 1]; p++)
		{
			p[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (; m > 0; m--)
		{
			t = a[n - 1];
			for (p = a[n - 2]; p >= a; p--)
			{
				p[1] = p;
			}
			a[0] = t;
		}
		System.out.print(a[0]);
		for (p = a[1]; p <= a[n - 1]; p++)
		{
			System.out.print(" ");
			System.out.print(p);
		}

		return 0;
	}
}

