package <missing>;

public class GlobalMembers
{
	public static void Delete(int[][] a, int n, int p)
	{
		if (n == 1)
		{
			return; //?????????????????
		}
		int i; //min??????????, Min[101]???????????
		int j;
		int k;
		int l;
		int m;
		int q;
		int r;
		int s;
		int min;
		int[] Min = new int[101];
		for (i = 0; i < n; i++)
		{
		   min = check_min(a[i], n); //?min?????????
		   for (j = 0; j < n; j++)
		   {
			   a[i][j] = a[i][j] - min; //???????????
		   }
		}
		for (i = 0; i < n; i++) //????????????Min[i]
		{
		   for (j = 0; j < n; j++)
		   {
			  if (j == 0)
			  {
				  Min[i] = a[j][i];
			  }
			  if (a[j][i] < Min[i])
			  {
				  Min[i] = a[j][i];
			  }
		   }
		}
		for (i = 0; i < n; i++)
		{
		   for (j = 0; j < n; j++)
		   {
			   a[j][i] = a[j][i] - Min[i]; //???????????
		   }
		}
		sum[p] = sum[p] + a[1][1]; //?????sum[p]?????????????a[1][1]
		for (k = 2; k < n; k++)
		{
			for (l = 2; l < n; l++)
			{
			   a[k - 1][l - 1] = a[k][l];
			}
		}
		for (m = 2; m < n; m++)
		{
		   a[0][m - 1] = a[0][m];
		   a[m - 1][0] = a[m][0];
		}
		Delete(a, n - 1, p); //?????????
	}
	public static int check_min(int[] a, int n)
	{
	   int min;
	   int i;
	   for (i = 0; i < n; i++)
	   {
		 if (i == 0)
		 {
			 min = a[i]; //?min??a[0]
		 }
		 if (a[i] < min)
		 {
			 min = a[i]; //??min??????????
		 }
	   }
	   return min;
	}

	public static int[] sum = new int[101]; //??????sum[101]???????????????, a[101][101]??????????????????
	public static int[][] a = new int[101][101];

	public static int Main()
	{
		int n;
		int p;
		int i;
		int j;
		int l;
		int m;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum, 0, (Integer.SIZE / Byte.SIZE)); //?a?sum???0
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
		   for (i = 0; i < n; i++)
		   {
			   for (j = 0; j < n; j++)
			   {
				  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
		   }
		   Delete(a, n, k); //??Delete??????
		}

		for (l = 0; l < n; l++) //???????????
		{
		   System.out.print(sum[l]);
		   System.out.print("\n");
		}
		return 0;
	}
}

