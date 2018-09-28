package <missing>;

public class GlobalMembers
{
	public static int row;
	public static int col;
	public static int[] a;
	public static int Main()
	{
	void out(int i,int j,int k);
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}
	a = new int[row * col];
	for (i = 0;i < row * col;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	System.out.printf("%d",a[0]);
	for (i = 1;i < col;i++)
	{
	out(i, i, 0);
	}
	for (i = 1;i < row;i++)
	{
	out(i, col - 1, i);
	}

	return 0;
	}

	public static void out(int i,int j,int k)
	{
	while (j != -1 && k != row)
	{
	System.out.printf("\n%d",a[k * col + j]);
	j--;
	k++;
	}
	}
}

