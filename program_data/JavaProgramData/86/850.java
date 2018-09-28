package <missing>;

public class GlobalMembers
{
	//???2010?11?24?
	//???1000010586_???
	//???????

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int[] stu = new int[20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i <= n - 1 ; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
				continue;
			}
			for (k = 0 ; k <= m - 1 ; k++)
			{
				stu[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 0 ; j <= m - 1 ; j++)
			{
				if (stu[j] + 3 * j > 60)
				{
					break;
				}
			}
			if (stu[j - 1] + 3 * j > 60)
			{
				System.out.print(stu[j - 1]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(60 - 3 * j);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

