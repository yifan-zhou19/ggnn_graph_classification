package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int c;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[100];
	int[] b = new int[100];
	for (int i = 0;i < n - 1;i++)
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
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		a[n - 1] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		b[n - 1] = Integer.parseInt(tempVar5);
	}


	for (int k = 1;k <= n;k++)
	{
	int e;
	for (int i = 0;i < n - k;i++)
	{
	if (a[i] > a[i + 1])
	{
	e = a[i + 1];
	a[i + 1] = a[i];
	a[i] = e;

	e = b[i + 1];
	b[i + 1] = b[i];
	b[i] = e;

	}
	}
	}



	for (c = 0;c < n - 1;c++)
	{
	for (m = 0;m <= c;m++)
	{
	if (b[m] >= a[c + 1])
	{
	 break;
	}
	 else
	 {
		continue;
	 }
	}

	if (m != c + 1)
	{
		continue;
	}
	else
	{
		break;
	}
	}



	if (c == n - 1)
	{

	for (int k = 1;k <= n;k++)
	{
	int e;
	for (int i = 0;i < n - k;i++)
	{
	if (b[i] > b[i + 1])
	{
	e = b[i + 1];
	b[i + 1] = b[i];
	b[i] = e;
	}
	}
	}


	System.out.printf("%d %d",a[0],b[n - 1]);
	}
	else
	{
	System.out.print("no");
	}


	return 0;
	}


}

