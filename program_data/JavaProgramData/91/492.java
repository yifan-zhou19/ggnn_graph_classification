package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] z = new char[2][150];
		z[0] = new Scanner(System.in).nextLine();
		int i = 0;
		int n = String.valueOf(z[0]).length();
		for (i = 0;i < n - 1;i++)
		{
			z[1][i] = z[0][i] + z[0][i + 1];
		}
		z[1][n - 1] = z[0][n - 1] + z[0][0];
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",z[1][i]);
		}
		return 0;
	}
}
