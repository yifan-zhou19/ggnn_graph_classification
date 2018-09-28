package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[n][60];
		int[] b1 = new int[n];
		for (i = 0;i < n;i++)
		{
			int m;
			int k = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] b = new int[m];
			for (j = 0;j < m;j++)
			{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = m - 1;j > 0;j--)
			{
			b[j] = b[j] - b[j - 1];
			}
			for (j = 0;j < m;j++)
			{
			   for (;b[j] > 0 && k < 60;k++, b[j]--)
			   {
			   a[i][k] = 1;
			   }
			   a[i][k] = 0;
			   k++;
			   a[i][k] = 0;
			   k++;
			   a[i][k] = 0;
			   k++;
			}
			int mn;
			for (mn = k;mn < 60;mn++)
			{
			a[i][mn] = 1;
			}
			b1[i] = 0;
		  for (j = 0;j < 60;j++)
		  {
		  if (a[i][j] == 1)
		  {
		  b1[i]++;
		  }
		  }
		}
		for (i = 0;i < n;i++)
		{
		System.out.print(b1[i]);
		System.out.print("\n");
		}

		return 0;
	}

}

