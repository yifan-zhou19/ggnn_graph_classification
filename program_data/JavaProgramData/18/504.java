package <missing>;

public class GlobalMembers
{
	public static int[] minx = new int[1000];
	public static int[] miny = new int[1000];
	 public static int n;
	 public static int m;
	 public static int[][] a = new int[105][105];
	 public static int[][] b = new int[105][105];
	public static void calc_min()
	{
		 for (int i = 0;i < m;i++)
		 {
				 minx[i] = 100000;
				 miny[i] = 100000;
		 }
		 for (int i = 0;i < m;i++)
		 {
				 for (int j = 0;j < m;j++)
				 {
						 if (a[i][j] < minx[i])
						 {
							 minx[i] = a[i][j];
						 }
						 //if(a[i][j]<miny[j])miny[j]=a[i][j]; 
				 }
		 }
		 for (int i = 0;i < m;i++)
		 {
				 for (int j = 0;j < m;j++)
				 {
						 a[i][j] -= minx[i];
				 }
		 }
		 for (int i = 0;i < m;i++)
		 {
				 for (int j = 0;j < m;j++)
				 {
						 //if(a[i][j]<minx[i])minx[i]=a[i][j];
						 if (a[i][j] < miny[j])
						 {
							 miny[j] = a[i][j];
						 }
				 }
		 }
		 for (int i = 0;i < m;i++)
		 {
				 for (int j = 0;j < m;j++)
				 {
						 a[i][j] -= miny[j];
				 }
		 }

	}
	public static void calc_delete()
	{

		 for (int i = 0;i < m;i++)
		 {
				 if (i - 1 != 0)
				 {
						for (int j = 0;j < m;j++)
						{
								if (j == 1)
								{
									continue;
								}
								int x = i;
								int y = j;
								if (x != 0)
								{
									x--;
								}
								if (y != 0)
								{
									y--;
								}
								b[x][y] = a[i][j];
						}
				 }
		 }
		 m--;
		 for (int i = 0;i < m;i++)
		 {
				 for (int j = 0;j < m;j++)
				 {
						 a[i][j] = b[i][j];
				 }
		 }
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
				int ans = 0;
				for (int j = 0;j < n;j++)
				{
						for (int k = 0;k < n;k++)
						{
								a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
				}
				m = n;

				while (m > 2)
				{

						   calc_min();
						   ans += a[1][1];
						   calc_delete();
				}
				calc_min();
				ans += a[1][1];
				System.out.print(ans);
				System.out.print("\n");
		}

		//cin>>n;

		return 0;
	}



}

