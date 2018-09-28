package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int[] a = new int[100009];

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1 ; i <= n ; ++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1 ; i <= n ; ++i)
		{
			if (a[i] == k)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memmove' has no equivalent in Java:
				memmove(a[i], a[i + 1], (n - --i) * sizeofa);
				--i;
			}
		}

		for (int i = 1 ; i <= n ; ++i)
		{
			System.out.print(a[i]);
			System.out.print((i == n != 0 ? '\n' : ' '));
		}
	}

}

