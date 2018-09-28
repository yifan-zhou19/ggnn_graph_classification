package <missing>;

public class GlobalMembers
{
	// 5*5 ??
	public static int FindAndExchange(int[][] Matrix, int n, int m)
	{
	int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * num_n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * num_m;
	if (!(n >= 0 && n <= 4 && m >= 0 && m <= 4))
	{
	return 0;
	}
	num_n = Matrix[n][0];
	num_m = Matrix[m][0];
	for (i = 0; i < 5; i++)
	{
	*num_n ^= *num_m;
	*num_m ^= *num_n;
	*num_n ^= *num_m;
	num_n++;
	num_m++;
	}
	return 1;
	}
	public static int Main()
	{
	int[][] Matrix = new int[5][5];
	int i;
	int j;
	int n;
	int m;
	for (i = 0; i < 5; i++)
	{
	for (j = 0; j < 5; j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		Matrix[i][j] = Integer.parseInt(tempVar);
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
	if (FindAndExchange(Matrix, n, m) != 0)
	{
	for (i = 0; i < 5; i++)
	{
	if (i > 0)
	{
		System.out.print("\n");
	}
	for (j = 0; j < 5; j++)
	{
	if (j > 0)
	{
		System.out.print(" ");
	}
	System.out.printf("%d", Matrix[i][j]);
	}
	}
	}
	else
	{
	System.out.print("error");
	}
	return 0;
	}
}

