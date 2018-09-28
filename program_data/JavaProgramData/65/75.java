package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int m = 0;
	int q = 0;
	int[] a = new int[201];
	int[] b = new int[201];
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
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] - b[i] == -1 || a[i] - b[i] == 2)
		{
		m++;
		}
		else if (a[i] == b[i])
		{
		m = m + 1 - 1;
		}
		else if (a[i] - b[i] == 1 || a[i] - b[i] == -2)
		{
		q++;
		}
	}
	if (m == q)
	{
	System.out.print("Tie");
	}
	else if (m > q)
	{
	System.out.print("A");
	}
	else if (m < q)
	{
	System.out.print("B");
	}
	return 0;
	}
}

