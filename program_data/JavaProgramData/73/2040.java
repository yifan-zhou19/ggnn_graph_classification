package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5]; //max???????? min????????  pa??????? pi??????
		int i;
		int j;
		int max = 0;
		int min = 0;
		int[] pa = new int[5];
		int[] pi = new int[5];
		int s = 0;
		for (i = 0;i < 5;i++)
		{
			max = 0;
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] >= max) //????????????????
				{
					max = a[i][j];
					pa[i] = j;
				}
			}
		}

			for (j = 0;j < 5;j++) //????????????????
			{
				min = a[0][j];
				for (i = 0;i < 5;i++)
				{
					if (a[i][j] <= min)
					{
						min = a[i][j];
						pi[j] = i;
					}
				}
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == pa[i] && i == pi[j]) //????????????
					{
						System.out.print(i + 1);
						System.out.print(" ");
						System.out.print(j + 1);
						System.out.print(" ");
						System.out.print(a[i][j]);
						System.out.print("\n");
						s = 1;
					}
				}
			}
				if (s == 0)
				{
					System.out.print("not found");
					System.out.print("\n");
				}
				return 0;
	}
}

