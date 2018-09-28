package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[10][100];
		int n = 0;
		while ((a[n] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			n++;
		}
		for (int i = n - 1; i > 0;--i)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[0]);
		System.out.print("\n");
		return 0;
	}
}

