package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][40];
		int n;
		int m;
		int i;
		int[] b = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = String.valueOf(a[i]).length() + 1;
		}
		m = b[0];
		for (i = 0;i < n;i++)
		{
			m += b[i + 1];
			if (m <= 81 && i != n - 1)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[i]);
				System.out.print("\n");
				m = b[i + 1];
			}
		}
		return 0;
	}
}

