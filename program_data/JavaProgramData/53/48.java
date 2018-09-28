package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[300];
	int i;
	int j;
	int m = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	int[] b = new int[300];
	for (i = 0;i < n;i++)
	{
		int t = 1;
	for (j = 0;j < 300;j++)
	{
		if (b[j] == a[i])
		{
			t = 0;
		}
	}
	if (t == 1)
	{
		b[m] = a[i];
		m++;
	}
	}
	System.out.printf("%d",b[0]);
	for (i = 1;i < m;i++)
	{
		if (b[i] != 0)
		{
			System.out.printf(",%d",b[i]);
		}
	}
	}
}

