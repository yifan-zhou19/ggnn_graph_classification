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
		int s;
		int[][] a = new int[100][100];
		int[] p = new int[100];
		int[] sum = new int[100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (s = 0;s < k;s++)
		{
		   p = a;
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   for (i = 0;i < n;i++)
		   {
			  for (j = 0;j < m;j++)
			  {
			  *(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			  }
		   }
		   for (i = 0;i < n;i++)
		   {
				 if ((i == 0) || (i == n - 1))
				 {
				 for (j = 0;j < m;j++)
				 {
				 sum[s] = sum[s] + *(p[i] + j);
				 }
				 }
				 else
				 {
				 sum[s] = sum[s] + *(p[i]) + *(p[i] + m - 1);
				 }
		   }
		}
		for (i = 0;i < k;i++)
		{
		System.out.print(sum[i]);
		System.out.print("\n");
		}
		return 0;
	}
}

