package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int p;
		int q;
		int m;
		int n;
		int k;
		int[][] a = new int[200][200];
		int sum;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (p = 0;p < m;p++)
			{
					for (q = 0;q < n;q++)
					{
					a[p][q] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					}
			} //??
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer;
			int pointer;
			pointer = a;
			for (p = 0;p < n;p++)
			{
				sum = sum + *(pointer + p);
			}
			for (p = 1;p < m - 1;p++)
			{
				sum = sum + *(*(a + p) + 0) + *(*(a + p) + n - 1);
			}
			for (p = 0;p < n;p++)
			{
				sum = sum + *(*(a + m - 1) + p);
			} //????????????

			System.out.print(sum);
			System.out.print("\n");
		}



		return 0;
	}

}

