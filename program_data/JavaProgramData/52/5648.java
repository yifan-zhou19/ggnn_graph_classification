package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int[] a = new int[110];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - m;i < n;i++)
		{
			System.out.print((a + i));
			System.out.print(" ");
		}
		for (i = 0;i < n - m;i++)
		{
			if (i < n - m - 1)
			{
				System.out.print((a + i));
				System.out.print(" ");
			}
			else
			{
				System.out.print((a + i));
				System.out.print("\n");
			}
		}
		  return 0;
	}

}

