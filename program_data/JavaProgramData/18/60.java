package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int n1;
	public static int p;
	public static int q;
	public static int matrix(int[][] a)
	{
		int i;
		int j;
		int sum = 0;
		int[] smin = new int[101];
		int[] dmin = new int[101];
		int[][] t = new int[101][101];

	for (i = 0;i < n1;i++)
	{
		smin[i] = mi(a[i]);
	}
	for (i = 0;i < n1;i++)
	{
	  for (j = 0;j < n1;j++)
	  {
		  if (smin[i] != 0)
		  {
		  a[i][j] -= smin[i];
		  }
	  }
	}
	for (j = 0;j < n1;j++)
	{
			for (i = 0;i < n1;i++)
			{
				t[j][i] = a[i][j];
			}
	}
	for (i = 0;i < n1;i++)
	{
		dmin[i] = mi(t[i]);
	}
	for (i = 0;i < n1;i++)
	{
	  for (j = 0;j < n1;j++)
	  {
		  if (dmin[i] != 0)
		  {
		a[j][i] -= dmin[i];
		  }
	  }
	}
	sum = a[1][1];
	/*for(p=0;p<n1;p++)
	{for(q=0;q<n1;q++)
	cout<<a[p][q];cout<<endl;}*/
	if (n1 == 2)
	{
		return a[1][1];
	}
	xiao(a);
	n1--;
	sum = sum + matrix(a);
	return sum;
	}
	public static int mi(int[] a)
	{
	int i;
	int min = a[0];
	for (i = 0;i < n1;i++)
	{
	  if (a[i] <= min)
	  {
		  min = a[i];
	  }
	}
	return min;
	}
	public static void xiao(int[][] a)
	{
	int i;
	int j;
	for (i = 1;i < n1;i++)
	{
	   a[0][i] = a[0][i + 1];
	}
	a[0][i] = 0;
	for (j = 1;j < n1;j++)
	{
		for (i = 1;i < n1;i++)
		{
	a[j][i] = a[j + 1][i + 1];
		}
	a[j][i] = 0;
	}
	for (i = 1;i < n1;i++)
	{
	a[i][0] = a[i + 1][0];
	}


	for (i = 0;i < n1;i++)
	{
	a[n - 1][i] = 0;
	}
	/*for(p=0;p<n1;p++)
	{for(q=0;q<n1;q++)
	cout<<a[p][q];cout<<endl;}*/

	}
	public static int Main()
	{
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		n1 = n;
		int[][] a = new int[101][101];
			for (p = 0;p < n;p++)
			{
	  for (q = 0;q < n;q++)
	  {
		a[p][q] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
			}
	System.out.print(matrix(a));
	System.out.print("\n");
	/*for(p=0;p<n;p++)
	{for(q=0;q<n;q++)
	cout<<a[p][q];cout<<endl;}*/
	}
	return 0;
	}
}

