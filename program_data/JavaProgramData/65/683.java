package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j = 0;
	int k = 0;
	int[] a = new int[200];
	int[] b = new int[200];
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
	if (a[i] == b[i])
	{
	j = j;
	k = k;
	}
	else if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
	{
	j++;
	}
	else
	{
	k++;
	}
	}
	if (j == k)
	{
	System.out.print("Tie");
	}
	else if (j > k)
	{
	System.out.print("A");
	}
	else
	{
		System.out.print("B");
	}
	return 0;
	}

}

