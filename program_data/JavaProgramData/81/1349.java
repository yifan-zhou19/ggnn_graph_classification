package <missing>;

public class GlobalMembers
{
	public static int trans(int[][] a, int n, int m)
	{
	if (0 <= n != 0 && n < 5 && 0 <= m != 0 && m < 5)
	{
	 int i;
	 int tmp;
	 for (i = 0;i < 5;i++)
	 {
	   tmp = a[n][i];
	   a[n][i] = a[m][i];
	   a[m][i] = tmp;
	 }
	return 1;
	}
	else
	{
	return 0;
	}
	}
	public static int Main()
	{
	  int i;
	  int j;
	  int[][] value = new int[5][5];
	int n;
	int m;
	 for (i = 0;i < 5;i++)
	 {
	 for (j = 0;j < 5;j++)
	 {
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		value[i][j] = Integer.parseInt(tempVar);
	}
	 }
	 }
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	if (trans(value, n, m) == 0)
	{
	System.out.print("error\n");
	}
	else
	{
	 for (i = 0;i < 5;i++)
	 {
	System.out.printf("%d %d %d %d %d\n",value[i][0],value[i][1],value[i][2],value[i][3],value[i][4]);
	 }
	}
	return 0;
	}
}

