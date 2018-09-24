package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q = null;
		int q = null;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				q = (*(a + i) + j);
				if (q == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag != 0)
			{
				break;
			}
		}
		int len = 1;
		int wid = 1;
		int j1 = j;
		for (j = j + 1; j <= n; j++)
		{
			q = (*(a + i) + j);
			if (q == 0)
			{
				len++;
			}
			else
			{
				break;
			}
		}
		for (i = i + 1; i <= n; i++)
		{
			q = (*(a + i) + j1);
			if (q == 0)
			{
				wid++;
			}
			else
			{
				break;
			}
		}

		System.out.print((len - 2) * (wid - 2));
		return 0;
	}
}

