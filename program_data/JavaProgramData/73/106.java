package <missing>;

public class GlobalMembers
{
	public static int findmin(int[] a)
	{
	int x = a[0];
	int y = 0;
	for (int i = 1;i < 5;i++)
	{
	   if (a[i] < x)
	   {
		x = a[i];
		y = i;
	   }
	}
	return y;
	}

	public static int findmax(int[] a)
	{
	int x = a[0];
	int y = 0;
	for (int i = 0;i < 5;i++)
	{
	   if (a[i] > x)
	   {
		x = a[i];
		y = i;
	   }
	}
	return y;
	}

	public static int Main()
	{
	int[][] a = new int[5][5];
	int[][] b = new int[5][5];
	int[] max = new int[5];
	int[] min = new int[5];
	int pp = 0;
	for (int i = 0;i < 5;i++)
	{
	   for (int j = 0;j < 5;j++)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar);
		   }
		   b[j][i] = a[i][j];
	   }
	}
	for (int i = 0;i < 5;i++)
	{
	   max[i] = findmax(a[i]);
	   min[i] = findmin(b[i]);
	}
	for (int i = 0;i < 5;i++)
	{
	   if (i == min[max[i]])
	   {
		System.out.printf("%d %d %d",i + 1,max[i] + 1,a[i][max[i]]);
		pp = 1;
	   }
	}
	if (pp == 0)
	{
		System.out.print("not found");
	}
	}

}

