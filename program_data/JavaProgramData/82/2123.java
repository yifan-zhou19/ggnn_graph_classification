package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[100];
	int[] b = new int[100];
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	int[] s = new int[100];
	for (int m = 0;m < n;m++)
	{
	if (a[m] >= 90 && a[m] <= 140 && b[m] >= 60 && b[m] <= 90)
	{
	s[m] = 1;
	}
	else
	{
	s[m] = 0;
	}
	}
	int q = 1;
	for (int k = 0;k < n - 1;k++)
	{
	if (s[k] != 0 && s[k + 1] != 0)
	{
	s[k + 1] = s[k] + 1;
	}
	}
	int max = 0;
	for (int p = 0;p < n;p++)
	{
	if (s[p] >= max)
	{
	max = s[p];
	}
	}
	System.out.printf("%d",max);
	return 0;
	}
}

