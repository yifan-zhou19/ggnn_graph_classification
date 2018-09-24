package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void nixu(int,int a[]);
		int i;
		int[] a = new int[100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		nixu(n, a);
		return 0;
	}

	public static void nixu(int n, int[] a)
	{
		if (n == 1)
		{
			System.out.print(a[0]);
		}
		else
		{
		System.out.print(a[n - 1]);
		System.out.print(' ');
		nixu(n - 1, a);
		}
	}
}

