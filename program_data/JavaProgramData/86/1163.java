package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[][] b = new int[100][20];
		int i;
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j < a[i]; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < a[i]; j++)
			{
				if ((b[i][j] + j * 3 + 3) >= 60)
				{
					if ((b[i][j] + j * 3) < 60)
					{
						System.out.print(b[i][j]);
						System.out.print("\n");
					}
					else
					{
						System.out.print(60 - j * 3);
						System.out.print("\n");
					}
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print(60 - j * 3);
				System.out.print("\n");
			}
			flag = 0;
		}
		return 0;
	}
}

