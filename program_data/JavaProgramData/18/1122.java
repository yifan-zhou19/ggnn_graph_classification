package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int time = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int s = n;
		int[][] a = new int[100][100];
		int[] b = new int[100];
		int[] c = new int[100];
		for (time = 0;time < s;time++) //while??????????????? .time??????????????????+1
		{
		   for (i = 0;i < 100;i++)
		   {
			   b[i] = 1000000;
			   c[i] = 1000000;
		   }
		   for (i = 0;i < s;i++)
		   {
			   for (j = 0;j < s;j++)
			   {
				   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
		   }
		   sum = 0; //?????? ,???????
		   while (true)
		   {
		   for (i = 0;i < 100;i++)
		   {
			   b[i] = 1000000;
			   c[i] = 1000000;
		   }
		   for (i = 0;i < n;i++)
		   {
			   for (j = 0;j < n;j++)
			   {
					if (a[i][j] < b[i])
					{
						 b[i] = a[i][j];
					}
			   }
		   } //????????
		   for (i = 0;i < n;i++)
		   {
				for (j = 0;j < n;j++)
				{
					   a[i][j] = a[i][j] - b[i];
				}
		   } //????????????
		   for (j = 0;j < n;j++)
		   {
				for (i = 0;i < n;i++)
				{
					if (a[i][j] < c[j])
					{
						 c[j] = a[i][j];
					}
				}
		   } //???????
		   for (j = 0;j < n;j++)
		   {
				for (i = 0;i < n;i++)
				{
					   a[i][j] = a[i][j] - c[j];
				}
		   } //????????
		   sum = sum + a[1][1]; //??
		   for (i = 1;i < n - 1;i++)
		   {
			   for (j = 0;j < n;j++)
			   {
					a[i][j] = a[i + 1][j];
			   }
		   } //??
		   for (j = 1;j < n - 1;j++)
		   {
			   for (i = 0;i < n - 1;i++)
			   {
					a[i][j] = a[i][j + 1];
			   }
		   } //??
		   n = n - 1;
		   if (n == 1)
		   {
				n = s;
				break;
		   } //????????
		   }
		   System.out.print(sum);
		   System.out.print("\n");
		}
		  return 0;
	}
}

