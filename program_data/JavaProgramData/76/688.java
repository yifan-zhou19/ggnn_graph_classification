package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int max;
	int t;
	int min;
	int[] a = new int[50000];
	int[] b = new int[5000];
	int[] s = new int[10000];
	for (i = 1;i < 10000;i++)
	{
	s[i] = 1;
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	for (j = a[i];j < b[i];j++)
	{
	s[j] = 0;
	}
	}
	max = b[0];
	min = a[0];
	for (i = 0;i < n;i++)
	{
	if (a[i] < min)
	{
	min = a[i];
	}
	if (b[i] > max)
	{
	max = b[i];
	}
	}
	t = 0;
	for (i = min;i < max;i++)
	{
	if (s[i] == 1)
	{
	t = t + 1;
	System.out.print("no");
	break;
	}
	}
	if (t == 0)
	{
	System.out.printf("%d %d",min,max);
	}

	}
}

