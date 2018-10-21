package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		for (i = 0; i <= 4; i++)
		{
			a[0][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.in.read();
		for (i = 0; i <= 4; i++)
		{
			a[1][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.in.read();
		for (i = 0; i <= 4; i++)
		{
			a[2][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.in.read();
		for (i = 0; i <= 4; i++)
		{
			a[3][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.in.read();
		for (i = 0; i <= 4; i++)
		{
			a[4][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int max = 0;
		int b = 0;
		int right = 1;
		int flag = 0;
		for (i = 0; i <= 4; i++)
		{
			max = 0;
			right = 1;
			for (j = 1; j <= 4; j++)
			{
				if (a[i][j] > a[i][max])
				{
					max = j;
				}
			}
			for (b = 0; b <= 4; b++)
			{
				if (a[b][max] < a[i][max])
				{
					right = 0;
					break;
				}
			}
			if (right == 1)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(max + 1);
				System.out.print(" ");
				System.out.print(a[i][max]);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

