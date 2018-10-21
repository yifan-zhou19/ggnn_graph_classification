package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[6][6];
	int i;
	int j;
	int x;
	int y;
	int max;
	int k;
	int s = 0;
	for (i = 1;i < 6;i++)
	{
	for (j = 1;j < 6;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i][j] = Integer.parseInt(tempVar);
	}
	}
	}
	for (i = 1;i < 6;i++)
	{
		max = 1;
	for (j = 1;j < 6;j++)
	{
	if (a[i][j] > a[i][max])
	{
	max = j;
	}
	}
	for (k = 1;k < 6;k++)
	{
	if (a[k][max] < a[i][max])
	{
	break;
	}
	}
	if (k == 6)
	{
	System.out.printf("%d %d %d\n",i,max,a[i][max]);
	s++;
	}
	}
	if (s == 0)
	{
	System.out.print("not found");
	}
	System.in.read();
	System.in.read();
	}

}

