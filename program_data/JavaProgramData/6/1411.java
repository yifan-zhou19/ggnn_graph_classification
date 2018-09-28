package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int m = 0;
		int n = 0;
		int[][] a = new int[500][500];
		(int)(*p)[500];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		p = a;
		for (int l = 0;l < k;l++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			int result = 0;
			p = a;
			for (i = 0;i < m;i++)
			{
				result = result + *(*(p + i));
			}
			p = a;
			for (i = 0;i < m && n != 1;i++)
			{
				result = result + *(*(p + i) + n - 1);
			}
			p = a + m - 1;
			for (i = 1;i < n - 1;i++)
			{
				result = result + *(*p + i);
			}
			p = a;
			for (i = 1;i < n - 1;i++)
			{
				result = result + *(*p + i);
			}
			System.out.print(result);
			System.out.print("\n");
		}

		return 0;
	}
}

