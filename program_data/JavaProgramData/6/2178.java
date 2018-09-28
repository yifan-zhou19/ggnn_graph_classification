package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0; //k??????????n????????
		int n = 0;
		int m = 0;
		int i = 0;
		int w = 0;
		int j = 0;
		int sum = 0;
		int[][] s = new int[101][101];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (w = 1;w <= k;w++)
		{
		   sum = 0;
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   for (i = 1;i <= n;i++)
		   {
			  for (j = 1;j <= m;j++)
			  {
				 *(s[i] + j) = ConsoleInput.readToWhiteSpace(true);
				 if ((i == 1) || (i == n) || (j == 1) || (j == m))
				 {
				 sum += *(s[i] + j);
				 }
			  }
		   }
		   System.out.print(sum);
		   System.out.print("\n");
		}
	return 0;
	}

}

