package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[201];
	int[] b = new int[201];
	int i;
	int n;
	int j = 0;
	int k = 0;
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
	}
	for (i = 0;i < n;i++)
	{
	if ((a[i] < b[i] && b[i] - a[i] != 2) || a[i] - b[i] == 2)
	{
	j++;
	}
	if ((a[i] > b[i] && a[i] - b[i] != 2) || b[i] - a[i] == 2)
	{
	k++;
	}
	}
	if (j > k)
	{
	System.out.print("A");
	}
	if (j < k)
	{
	System.out.print("B");
	}
	if (j == k)
	{
	System.out.print("Tie");
	}
	return 0;
	}
}

