package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int s = 0;
		int m;
		int n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = &a[0][0];
		int p = a[0][0];
		for (int t = 0; t < k; t++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = 0;
			for (int i = 0; i < m; i++)
			{
				for (int j = 0; j < n; j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}

			for (int i = 0; i < n; i++)
			{
				s += *(*(a + 0) + i);
				s += *(*(a + m - 1) + i);
			} //cout<<s<<endl;
			for (int i = 0; i < m; i++)
			{
				s += *(*(a + i) + 0);
				s += *(*(a + i) + n - 1);
			}
			s = s - * a - *(*(a + m - 1) + n - 1) - *(*(a + 0) + n - 1) - *(*(a + m - 1));
			System.out.print(s);
			System.out.print("\n");
		}
	}


}

