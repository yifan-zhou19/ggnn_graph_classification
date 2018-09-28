package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][300];
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;a[i][j] != '\0';j++)
			{
				if (a[i][j] == 'A')
				{
					System.out.print('T');
				}
				if (a[i][j] == 'T')
				{
					System.out.print('A');
				}
				if (a[i][j] == 'G')
				{
					System.out.print('C');
				}
				if (a[i][j] == 'C')
				{
					System.out.print('G');
				}
			}
			System.out.print("\n");
		}
		return 0;
	}






}

