package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (n == 1)
		{
			System.out.print(a[0]);
			System.out.print("\n");
		}
		else
		{
				System.out.print(a[n - 1]);
				for (int i = n - 2;i >= 0;i--)
				{
					   System.out.print(" ");
					   System.out.print(a[i]);
				}
		}
			return 0;
	}

}

