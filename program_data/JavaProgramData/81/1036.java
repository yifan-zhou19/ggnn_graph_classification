package <missing>;

public class GlobalMembers
{
	public static int jud(int n,int m)
	{
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
	int[][] a = new int[5][5];
	int i;
	int j;
	int n;
	int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[5];
	int[] p = new int[5];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
	int q;
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
	p[i] = a[i];
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
	if (jud(n, m) == 0)
	{
	System.out.print("error");
	}
	else
	{
	q = p[n];
	p[n] = p[m];
	p[m] = q;
	for (i = 0;i < 5;i++)
	{
	for (j = 0;j < 5;j++)
	{
	if (j == 4)
	{
	System.out.printf("%d\n",*(p[i] + j));
	}
	else
	{
		System.out.printf("%d ",*(p[i] + j));
	}
	}
	}
	}
	return 0;
	}
}

