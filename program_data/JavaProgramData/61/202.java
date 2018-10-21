package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[100];
	int[] b = new int[100];
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
	}
	int s = 2;
	b[0] = 1;
	b[1] = 1;
	for (i = 0;i < n;i++)
	{
	if (a[i] <= 2)
	{
	System.out.print("1\n");
	}
	else
	{
	for (s = 2;s < a[i];s++)
	{
	int j = s - 1;
	int k = s - 2;
	b[s] = b[j] + b[k];
	}
	int m = a[i] - 1;
	System.out.printf("%d\n",b[m]);
	}
	}
	}
}

