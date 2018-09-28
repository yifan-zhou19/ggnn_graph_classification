package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int e;
	int n;
	int i;
	int j;
	int k;
	int[] a = new int[101];
	int[] b = new int[101];
	int[] c = new int[101];
	String ex = new String(new char[11]);
	char[][] s = new char[101][11];
	char[][] s1 = new char[101][11];
	char[][] s2 = new char[101][11];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0,j = 0,k = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	if (a[i] >= 60)
	{
	s1[j] = s[i];
	b[j] = a[i];
				j++;
	}
	else
	{
	s2[k] = s[i];
	c[k] = a[i];
	k++;
	}
	}
	for (m = 1;m <= j;m++)
	{
	for (i = 0;i < j - m;i++)
	{
	if (b[i] < b[i + 1])
	{
	ex = s1[i];
	s1[i] = s1[i + 1];
	s1[i + 1] = ex;
	e = b[i];
	b[i] = b[i + 1];
	b[i + 1] = e;
	}
	}
	}
	for (i = 0;i < j;i++)
	{
	System.out.printf("%s\n",s1[i]);
	}
	for (i = 0;i < k;i++)
	{
	System.out.printf("%s\n",s2[i]);
	}
	return 0;
	}
}

