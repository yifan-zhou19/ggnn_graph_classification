package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double f = new double(int a[],int b[]);
		int n;
		int[][] a = new int[10][3];
		int count = 0;
		int i;
		int j;
		int k;
		int[][] d = new int[45][2];
		int num = 0;
		int g = new int(int i,int j,int k,int d[][2],double b[],int n);
		double t;
		double[] b = new double[45];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b[count] = f(a[i], a[j]);
			count++;
			}
		}
			for (i = 0;i < n * (n - 1) / 2 - 1;i++)
			{
				for (j = 0;j < n * (n - 1) / 2 - 1 - i;j++)
				{
					if (b[j] < b[j + 1])
					{
			t = b[j];
			b[j] = b[j + 1];
			b[j + 1] = t;
					}
				}
			}
		 for (i = 0;i < n - 1;i++)
		 {
			 for (j = i + 1;j < n;j++)
			 {
		  if (f(a[i], a[j]) == b[0])
		  {
			 System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i][0],a[i][1],a[i][2],a[j][0],a[j][1],a[j][2],b[0]);
			 d[0][0] = i;
			 d[0][1] = j;
			 num++;
			 break;
		  }
			 }
		 if (num == 1)
		 {
			 num = 0;
			 break;
		 }
		 }
		 for (k = 1;k < n * (n - 1) / 2;k++)
		 {
		 for (i = 0;i < n - 1;i++)
		 {
			 for (j = i + 1;j < n;j++)
			 {
				if (f(a[i], a[j]) == b[k])
				{
					if (b[k] != b[k - 1])
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i][0],a[i][1],a[i][2],a[j][0],a[j][1],a[j][2],b[k]);
						d[k][0] = i;
						d[k][1] = j;
				num++;
				break;
					}
				else if (g(i, j, k, d, b, n))
				{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i][0],a[i][1],a[i][2],a[j][0],a[j][1],a[j][2],b[k]);
					d[k][0] = i;
					d[k][1] = j;
				num++;
				break;
				}
				}
			 }
				if (num == 1)
				{
					num = 0;
					break;
				}
		 }
		 }
		return 0;
	}
	  public static double f(int[] a, int[] b)
	  {
		  double d;
	  d = Math.sqrt((a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]) + (a[2] - b[2]) * (a[2] - b[2]));
		  return d;
	  }


		public static int g(int i, int j, int k, int[][] d, double[] b, int n)
		{
			int x;
			int num1 = 0;
		 for (x = 0;x <= k;x++)
		 {
			 if (b[x] == b[k])
			 {
				 num1++;
			 }
		 }
			 for (x = 1;x < num1;x++)
			 {
				 if (d[k - x][0] == i && d[k - x][1] == j)
				 {
					 return 0;
					 break;
				 }
			 }
				 if (x >= num1)
				 {
					 return 1;
				 }
		}

}

