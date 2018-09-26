package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int m;
	int l;
	int[] a = new int[200];
	int[] b = new int[200];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	m = l = 0;
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
	if (a[i] == 0 && b[i] == 1)
	{
	m += 1;
	}
	if (a[i] == 1 && b[i] == 0)
	{
	l += 1;
	}
	if (a[i] == 0 && b[i] == 2)
	{
	l += 1;
	}
	if (a[i] == 1 && b[i] == 2)
	{
	m += 1;
	}
	if (a[i] == 2 && b[i] == 0)
	{
	m += 1;
	}
	if (a[i] == 2 && b[i] == 1)
	{
	l += 1;
	}
	if (a[i] == b[i])
	{
	continue;
	}
	}
	if (m > l)
	{
	System.out.print("A");
	}
	else if (m < l)
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

