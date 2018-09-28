package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[7][7];
	public static int x;
	public static int y;
	public static int Main()
	{
		int i = 0;
		int j;
		int k;
		int l;
		for (j = 1; j <= 5; ++j)
		{
			for (k = 1; k <= 5; ++k)
			{
				a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 1; j <= 5; ++j) //?????????
		{
			for (k = 1; k <= 5; ++k)
			{
				for (l = 1; l <= 5; ++l) //????????
				{
					if (a[j][l] > a[j][k])
					{
						break;
					}
				}
				if (l <= 5)
				{
					continue;
				}
				for (l = 1; l <= 5; ++l) //????????
				{
					if (a[l][k] < a[j][k])
					{
						break;
					}
				}
				if (l > 5) //????????
				{
					i = 1;
					System.out.print(j);
					System.out.print(" ");
					System.out.print(k);
					System.out.print(" ");
					System.out.print(a[j][k]);
					System.out.print("\n");
				}
			}
		}
		if (i == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

