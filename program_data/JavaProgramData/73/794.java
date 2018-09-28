package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[6][6];
	int i;
	int j;
	int p;
	int q;
	int[] max = new int[6];
	int[] min = new int[6];
	int s = 0;
	for (i = 0;i < 5;i++)
	{
	for (j = 0;j < 5;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i][j] = Integer.parseInt(tempVar);
	}
	}
	}
		max[0] = a[0][0];
	min[0] = a[0][0];
	for (p = 0;p < 5;p++)
	{
	for (q = 0;q < 5;q++)
	{
	if (max[p] < a[p][q])
	{
	max[p] = a[p][q];
	}
	if (min[q] > a[p][q])
	{
	min[q] = a[p][q];
	}
	}
	}
	for (p = 0;p < 5;p++)
	{
	for (q = 0;q < 5;q++)
	{
			 if (max[p] == min[q])
			 {
			 System.out.printf("%d %d %d",p + 1,q + 1,a[p][q]);
			s = s + 1;
			 }
	}
	}
	if (s == 0)
	{
	 System.out.print("not found");
	}
	return 0;
	}



}

