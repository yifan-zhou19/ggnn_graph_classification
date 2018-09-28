package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int s = 0;
	int m = 0;
	int[] b = new int[201];
	 int[][] a = new int[201][201];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < 2;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i][j] = Integer.parseInt(tempVar2);
	}
	}
	}
	for (j = 0;j < 2;j++)
	{

	for (i = 0;i < n;i++)
	{
	b[i] = a[i][0];
	}
	for (i = 0;i < n;i++)
	{
	if (a[i][1] == b[i])
	{
	continue;
	}
	else if ((a[i][1] == 0 && b[i] == 1) || (a[i][1] == 1 && b[i] == 2) || (a[i][1] == 2 && b[i] == 0))
	{
	s++;
	}
	else
	{
		m++;
	}
	}
	if (s == m)
	{
	System.out.print("Tie");
	}
	else if (s > m)
	{
		System.out.print("B");
	}
	else
	{
	System.out.print("A");
	}
	return 0;
	}
	}



}

