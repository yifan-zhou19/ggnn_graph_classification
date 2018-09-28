package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] mat = new int[n];
		for (int i = 0;i < n;i++)
		{
			mat[i] = ConsoleInput.readToWhiteSpace(true);
		}

		for (int k = 0;k < m;k++)
		{
			int swap = mat[0];
			mat[0] = (mat + n - 1);
			for (int i = n - 2;i > 0;i--)
			{
				mat[i + 1] = (mat + i);
			}
			mat[1] = swap;
		}

		for (int i = 0;i < n - 1;i++)
		{
			System.out.print((mat + i));
			System.out.print(" ");
		}
		System.out.print((mat + n - 1));
	}

}

