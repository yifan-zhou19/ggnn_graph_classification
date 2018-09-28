package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] n = new int[100][100];
	int i;
	int j;
	int a;
	int b;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < a;i++)
	{
	for (j = 0;j < b;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (int m = 0;m < b;m++)
	{

		for (i = m, j = 0;i >= 0 && j < a;i--, j++)
		{
			System.out.printf("%d\n",n[j][i]);
		}
	}


	for (x = 1;x < a;x++)
	{

		for (j = x, i = b - 1;j < a && i >= 0;j++, i--)
		{
		 System.out.printf("%d\n",n[j][i]);
		}
	}
	int z;
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		z = Integer.parseInt(tempVar4);
	}
	return 0;
	}

}

