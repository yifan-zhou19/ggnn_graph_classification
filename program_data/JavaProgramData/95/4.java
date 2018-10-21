package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		char[][] a = new char[2][100];
		a[0] = new Scanner(System.in).nextLine();
		a[1] = new Scanner(System.in).nextLine();
		for (i = 0;i < 2;i++)
		{
			for (j = 0;a[i][j] != '\0';j++)
			{
				if (a[i][j] <= 'z' && a[i][j] >= 'a')
				{
					a[i][j] -= 32;
				}
			}
		}
		n = strcmp(a[0],a[1]);
		if (n == 1)
		{
			System.out.print(">");
		}
		else if (n == 0)
		{
			System.out.print("=");
		}
		else if (n == -1)
		{
			System.out.print("<");
		}
		return 0;
	}
}
