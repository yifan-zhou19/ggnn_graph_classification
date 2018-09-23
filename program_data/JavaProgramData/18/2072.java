package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[][][] a = new int[100][100][100];
		int minh;
		int minl;
		int[] sum = new int[100];
		int minhang = new int(int n,int k,int a[100][100]);
		int minlie = new int(int n,int k,int a[100][100]);
		int guilin = new int(int n,int a[100][100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						for (j = 0;j < n;j++)
						{
										for (k = 0;k < n;k++)
										{
														String tempVar2 = ConsoleInput.scanfRead();
														if (tempVar2 != null)
														{
															a[i][j][k] = Integer.parseInt(tempVar2);
														}
										}
						}
		}
		for (i = 0;i < n;i++)
		{
						System.out.printf("%d\n",guilin(n, a[i]));
		}
		return 0;
	}

	public static int guilin(int n, int[][] a)
	{
		int i;
		int j;
		int k;
		int sum = 0;
		int minh;
		int minl;
		if (n == 1)
		{
			return 0;
		}
		else
		{
			 for (j = 0;j < n;j++)
			 {
							 minh = minhang(n,j,a);
							 for (k = 0;k < n;k++)
							 {
								 a[j][k] -= minh;
							 }
			 }
			 for (j = 0;j < n;j++)
			 {
							 minl = minlie(n,j,a);
							 for (k = 0;k < n;k++)
							 {
								 a[k][j] -= minl;
							 }
			 }
			 sum += a[1][1];
			 for (j = 0;j < n;j++)
			 {
							 for (k = 0;k < n;k++)
							 {
											 if (j > 1 && k > 1)
											 {
												 a[j - 1][k - 1] = a[j][k];
											 }
											 else if (j > 1 && k == 0)
											 {
												 a[j - 1][k] = a[j][k];
											 }
											 else if (j == 0 && k > 1)
											 {
												 a[j][k - 1] = a[j][k];
											 }
											 else
											 {
												 a[j][k] = a[j][k];
											 }
							 }
			 }
			 sum += guilin(n - 1, a);
			 return (sum);
		}
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static minhang(int n, int k, int[][] a)
	{
				int min;
				int i;
				min = a[k][0];
				for (i = 0;i < n;i++)
				{
								if (a[k][i] < min)
								{
									min = a[k][i];
								}
				}
				return (min);
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static minlie(int n, int k, int[][] a)
	{
			   int min;
			   int i;
			   min = a[0][k];
			   for (i = 0;i < n;i++)
			   {
							   if (a[i][k] < min)
							   {
								   min = a[i][k];
							   }
			   }
			   return (min);
	}
}

