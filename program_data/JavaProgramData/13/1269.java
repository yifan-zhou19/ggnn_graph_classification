package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int[] a = new int[20000];
		int[] b = new int[100];
		int[] c = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < 100; i++)
		{
			b[i] = 1;
		}
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		t = 0;
		for (i = 0; i < n; i++)
		{
			if (b[a[i]] == 1)
			{
				c[t] = a[i];
				t++;
				b[a[i]] = 0;
			}
		}
		for (i = 0; i < t - 1; i++)
		{
			System.out.print(c[i]);
			System.out.print(" ");
		}
		System.out.print(c [t - 1]);
		System.out.print("\n");
		return 0;
	}
}

