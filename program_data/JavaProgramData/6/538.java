package <missing>;

public class GlobalMembers
{
	/*???1000012904_2.cpp
	  ?????????????
	  ?????
	  ???2010?12?10?
	*/
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < k; i++) //??????
		{
			int m; //????????????????????????
			int n;
			int[][] a = new int[100][100];
			int j;
			int l;
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j < m; j++)
			{
				for (l = 0; l < n; l++)
				{
					a[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 0; j < m; j++)
			{
				sum = sum + *(*(a + j)) + *(*(a + j) + n - 1); //?????????????????
			}
			for (j = 1; j < n - 1; j++)
			{
				sum = sum + *(a + j) + *(*(a + m - 1) + j); //???????????????
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}




}

