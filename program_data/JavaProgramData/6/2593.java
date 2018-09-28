package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int m;
		int sum;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (int l = 1;l <= k;l++)
		{
		  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (int i = 0;i < m;i++)
		  {
			for (int j = 0;j < n;j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		  }
		  sum = 0;
		  if (m > 1)
		  {
			for (int i = 0;i < n;i++)
			{
			sum = sum + *(a + i); //???????
			}
			for (int i = 0;i < n;i++)
			{
			sum = sum + *(*(a + m - 1) + i); //????????
			}
		  }
		  if (m == 1) //???????
		  {
			for (int i = 0;i < n;i++)
			{
			sum = sum + *(a + i);
			}
		  }
		  if (n > 1)
		  {
			for (int i = 1;i < m - 1;i++)
			{
			sum = sum + *(*(a + i)); //???????
			}
			for (int i = 1;i < m - 1;i++)
			{
			sum = sum + *(*(a + i) + n - 1); //????????
			}
		  }
		  if (n == 1) //??????
		  {
			for (int i = 1;i < m - 1;i++)
			{
			sum = sum + *(*(a + i));
			}
		  }
		  System.out.print(sum);
		  System.out.print("\n");
		}
		return 0;
	}

}

