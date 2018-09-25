package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int count;
		int min;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] input = new int[n][n];
		int[] sum = new int[n];
		for (i = 0;i < n;i++)
		{
			  count = n;
			  sum[i] = 0;
			  for (j = 0;j < n;j++)
			  {
				 for (k = 0;k < n;k++)
				 {
					input[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 }
			  }

			  while (count != 1)
			  {
			  for (j = 0;j < count;j++)
			  {
				 min = input[j][0];
				 for (k = 1;k < count;k++)
				 {
					if (input[j][k] < min)
					{
					   min = input[j][k];
					}
				 }
				 for (k = 0;k < count;k++)
				 {
					input[j][k] -= min;
				 }
			  } //???
			   for (j = 0;j < count;j++)
			   {
				 min = input[0][j];
				 for (k = 1;k < count;k++)
				 {
					if (input[k][j] < min)
					{
					   min = input[k][j];
					}
				 }
				 for (k = 0;k < count;k++)
				 {
					input[k][j] -= min;
				 }
			   } //???

			   sum[i] += input[1][1];
			   for (k = 0;k < count;k++)
			   {
				   for (j = 1;j < count - 1;j++)
				   {
					input[j][k] = input[j + 1][k];
				   }
			   }
				 for (k = 0;k < count - 1;k++)
				 {
				   for (j = 1;j < count - 1;j++)
				   {
					input[k][j] = input[k][j + 1]; //??
				   }
				 }
			   count--;
			  }
		}
		for (i = 0;i < n;i++)
		{
		  System.out.print(sum[i]);
		  System.out.print("\n");
		}
		return 0;
	}

}

