package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int rr;
		int cc;
		int[][] arr = new int[100][100];
		rr = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cc = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int i;
		int j;
		for (i = 0; i < rr; i++)
		{
			for (j = 0; j < cc; j++)
			{
				arr[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		//bianli
		for (j = 0; j < cc; j++)
		{
			i = 0;
			for (int k = j; k >= 0 && i <= rr - 1; k--, i++) //??????
			{
				System.out.print(arr[i][k]);
				System.out.print("\n");
			}
		}


		for (i = 1; i < rr; i++)
		{
			j = cc - 1;
			for (int p = i; p <= rr - 1 && j >= 0; p++, j--) //??????
			{
				System.out.print(arr[p][j]);
				System.out.print("\n");
			}

		}

	return 0;
	}
}

