package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		return *(int)a - (int)b;
	}

	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int b;
		a[0] = 1, a[1] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 2; i <= 30; i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		for (int i = 0; i < n; i++)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(a[b - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

