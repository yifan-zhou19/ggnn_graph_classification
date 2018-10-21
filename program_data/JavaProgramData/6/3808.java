package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int m;
		int i;
		int j;
		int l;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[][] a = new int[100][100];
		int s;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				for (l = 0;l < n;l++)
				{
					a[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			p = a[0][0];
			s = 0;
			for (j = 0;j < n;j++)
			{
				if (n == 1)
				{
					s += p;
				}
				else
				{
					s += (*(p + j) + *(p + 100 * (m - 1) + j));
				}
			}
			for (j = 1;j < m - 1;j++)
			{
				s += (*(p + j * 100) + *(p + j * 100 + n - 1));
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}







}

