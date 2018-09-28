package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int max = 0;
		int min = 9999999;
		int i = 0;
		int k = 0;
		for (i = 0; i < 5; i++)
		{
			for (k = 0; k < 5; k++)
			{
				a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			for (k = 0; k < 5; k++)
			{
					int n = 0;
					for (int q = 0; q < 5; q++)
					{
						if (a[i][k] >= a[i][q])
						{
							n++;
						}
						if (a[i][k] <= a[q][k])
						{
							n++;
						}
						if (n == 10)
						{
								System.out.print(i + 1);
								System.out.print(" ");
								System.out.print(k + 1);
								System.out.print(" ");
								System.out.print(a[i][k]);
								System.out.print("\n");
								return 0;
						}
					}
			}
		}
		System.out.print("not found");
		System.out.print("\n");
		return 0;
	}
}

