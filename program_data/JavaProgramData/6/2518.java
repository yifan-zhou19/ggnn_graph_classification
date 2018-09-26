package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int k;
	int i;
	int j;
	int l;
	int s = 0;
	int[][] a = new int[100][100];
	int m;
	int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	int p;
	p = a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
		s = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	p = a;
	for (j = 0;j < m;j++)
	{
	for (l = 0;l < n;l++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		(*(a + j) + l) = tempVar4;
	}
	}
	}
	for (j = 0;j < n;j++)
	{
	s = s + *(a[0] + j);
	}
	for (j = 0;j < n && m>1;j++)
	{
	s = s + *(a[m - 1] + j);
	}
	for (j = 1;j < m - 1;j++)
	{
	s = s + *(a[j]);
	}
	for (j = 1;j < m - 1 && n>1;j++)
	{
	s = s + *(a[j] + n - 1);
	}
	System.out.printf("%d\n",s);
	}
	}
}

