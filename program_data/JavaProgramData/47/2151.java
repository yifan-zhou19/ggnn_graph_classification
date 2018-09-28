package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] c = new int[100];
		int i;
		int k = 0;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = (n - 1); i >= 0; i--)
		{
			if (k == 1)
			{
				System.out.print(" ");
			}
			System.out.print(c[i]);
			k = 1;
		}
		System.out.print("\n");
		return 0;
	}

}

