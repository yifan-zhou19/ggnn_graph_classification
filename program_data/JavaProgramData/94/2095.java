package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int a;
	int b;
	int c;
	int[] m = new int[500];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0,j = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	if (a % 2 != 0)
	{
	m[j] = a;
	j++;
	}
	}
	for (b = j - 1;b > 0;b--)
	{
	for (i = 0;i < b;i++)
	{
	if (m[b] < m[i])
	{
	c = m[b];
	m[b] = m[i];
	m[i] = c;
	}
	}
	}
	System.out.printf("%d",m[0]);
	for (i = 1;i < j;i++)
	{
	System.out.printf(",%d",m[i]);
	}
	return 0;
	}

}

