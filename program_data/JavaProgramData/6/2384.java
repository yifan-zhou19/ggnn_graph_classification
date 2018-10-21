package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //????????????
		int m;
		int n;
		int i;
		int j;
		int[][] jz = new int[100][100];
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0) //????????
		{
			for (i = 0;i < m;i++) //?????
			{
				for (j = 0;j < n;j++)
				{
					jz[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			if (m == 1 && n == 1) //???
			{
				sum = jz[0][0];
			}
			else if (m == 1)
			{
				for (i = 0;i < n;i++)
				{
					sum = sum + jz[0][i];
				}
			}
			else if (m == 1)
			{
				for (i = 0;i < n;i++)
				{
					sum = sum + jz[0][i];
				}
			}
			else
			{
				for (i = 0;i < n;i++)
				{
					sum = sum + jz[0][i] + jz[m - 1][i];
				}
				for (i = 1;i < m - 1;i++)
				{
					sum = sum + jz[i][0] + jz[i][n - 1];
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}




}

