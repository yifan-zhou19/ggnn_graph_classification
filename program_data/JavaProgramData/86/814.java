package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????s,t,n,????a[100][60],??????i,j
		int[][] a = new int[100][60];
		int i;
		int[] m = new int[100];
		int j;
		int s;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //?????????????????
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m[i] != 0)
			{
				for (j = 0;j < m[i];j++)
				{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}
		for (i = 0;i < n;i++) //???????
		{
			if (m[i] == 0) //????????????
			{
					System.out.print(60);
					System.out.print("\n");
			}
			if (m[i] > 0) //????????????
			{
				j = m[i] - 1;
				s = a[i][j] + m[i] * 3;
				if (s > 60)
				{
					s = 0,j = 0;
				while (s <= 60)
				{
					s = 3 * (j + 1) + a[i][j];
					j++;
				}
				if (s - 3 > 60)
				{
					t = 60 - (j - 1) * 3;
				}
				else
				{
					t = 60 - (j - 1) * 3 - (3 - (s - 60));
				}
				}
				else
				{
					t = 60 - m[i] * 3;

				}
				System.out.print(t);
				System.out.print("\n");
			}
		}

		return 0;
	}

}

