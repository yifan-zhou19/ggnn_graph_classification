package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[102];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		} //??
		for (int i = n - 1;i >= 0;i--)
		{
			if (i == n - 1)
			{
				System.out.print((a + i));
			}
			else
			{
				System.out.print(" ");
				System.out.print((a + i));
			}
		} //??

			return 0;
	}

}

