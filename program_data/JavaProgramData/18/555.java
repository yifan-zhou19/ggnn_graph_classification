package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //len : the length of matrix
		int i;
		int j;
		int k;
		int len;
		int sum;
		int[][] m = new int[100][100];
		void cutr0(int m[100][100],int len);
		void cutc0(int m[100][100],int len);
		void del(int m[100][100],int n); //delete row[1] and column[1];return n-1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++)
		{
			sum = 0;
			len = n;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					m[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}


			while (len > 1)
			{
				cutr0(m, len);
				cutc0(m, len);
				sum += m[1][1];
				del(m, len);
				len--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}


	public static void cutr0(int[][] m, int len)
	{
		int[] min = new int[100]; //min[i] stores the min value of row[i]
		int i;
		int j;

		for (i = 0;i < len;i++)
		{
			min[i] = m[i][0];
			for (j = 1;j < len;j++)
			{
				if (min[i] > m[i][j])
				{
					min[i] = m[i][j];
				}
			}
		}

		for (i = 0;i < len;i++)
		{
			for (j = 0;j < len;j++)
			{
				m[i][j] -= min[i];
			}
		}
	}

	public static void cutc0(int[][] m, int len)
	{
		int[] min = new int[100]; //min[i] stores the min value of column[i]
		int i;
		int j;

		for (i = 0;i < len;i++)
		{
			min[i] = m[0][i];
			for (j = 1;j < len;j++)
			{
				if (min[i] > m[j][i])
				{
					min[i] = m[j][i];
				}
			}
		}

		for (i = 0;i < len;i++)
		{
			for (j = 0;j < len;j++)
			{
				m[i][j] -= min[j];
			}
		}
	}

	public static void del(int[][] m, int len)
	{
		int i;
		int j;
		for (i = 2;i < len;i++) //deal with row[0] and column[0]
		{
			m[0][i - 1] = m[0][i];
			m[i - 1][0] = m[i][0];
		}
		for (i = 2;i < len;i++)
		{
			for (j = 2;j < len;j++)
			{
				m[i - 1][j - 1] = m[i][j];
			}
		}
	}
}

