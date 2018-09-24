package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int j;
	int[] a = new int[201];
	int[] b = new int[201];
	int i;
	int m;
	int n;
	int h;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		j = Integer.parseInt(tempVar);
	}
	m = 0;
	n = 0;
	for (i = 0;i < j;i++)
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
	if (a[i] == 0 && b[i] == 1)
	{
		m++;
	}
	else if (a[i] == 0 && b[i] == 2)
	{
		n++;
	}
	else if (a[i] == 1 && b[i] == 0)
	{
		n++;
	}
	else if (a[i] == 1 && b[i] == 2)
	{
		m++;
	}
	else if (a[i] == 2 && b[i] == 0)
	{
		m++;
	}
	else if (a[i] == 2 && b[i] == 1)
	{
		n++;
	}
	else if (a[i] == 0 && b[i] == 0)
	{
		m = m;
		n = n;
	}
	else if (a[i] == 1 && b[i] == 1)
	{
		m = m;
		n = n;
	}
	else
	{
		m = m;
		n = n;
	}
	}
	h = m;
	k = n;
	if (h > k)
	{
		System.out.print("A");
	}
	else if (h < k)
	{
		System.out.print("B");
	}
	else
	{
		System.out.print("Tie");
	}
	return 0;
	}
}

