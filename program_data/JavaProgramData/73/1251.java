package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int l;
		int num = 0;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
				for (j = 0;j < 5;j++)
				{
					//???????????
					int p = 0;
					for (l = 0;l < 5;l++)
					{
					 if ((a[l][j] < a[i][j]) || (a[i][l]> a[i][j])) //??a[i][j]??????????????
					 {
					   p++;
					   break;
					 }
					}

					if (p == 0)
					{
						System.out.print(i + 1);
						System.out.print(" ");
						System.out.print(j + 1);
						System.out.print(" ");
						System.out.print(a[i][j]);
						System.out.print("\n");
							num++;
					} //??num???
				}
		}
		if (num == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
	}

}

