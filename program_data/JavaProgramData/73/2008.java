package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5]; //????5*5???
		int q = 0;
		int hang;
		int lie;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < 5; i++)
		{
			int p = 0;
			int k;
			for (int j = 0; j < 5; j++)
			{
				if (p < a[i][j])
				{
					p = a[i][j];
					lie = j;
				}
			}
			for (k = 0; k < 5; k++)
			{
				if (p > a[k][lie])
				{
					break;
				}
			}
			if (k == 5)
			{
				hang = i + 1;
				lie++;
				System.out.print(hang);
				System.out.print(" ");
				System.out.print(lie);
				System.out.print(" ");
				System.out.print(p);
				System.out.print("\n");
				q = 1;
			}
		}
		if (q == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
	return 0;
	}
}

