package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int x;
	int y;
	int i;
	int m;
	int n;
	int[] a = new int[15];
	int[] b = new int[15];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	a[0] = x;
	b[0] = y;

	for (i = 0;i < 11;i++)
	{
	if (a[i] == 0)
	{
	m = i - 1;
	break;
	}
	else
	{
	a[i + 1] = a[i] / 2;
	}
	}

	for (i = 0;i < 11;i++)
	{
	if (b[i] == 0)
	{
	n = i - 1;
	break;
	}
	else
	{
	b[i + 1] = b[i] / 2;
	}
	}

	for (;;m--,n--)
	{
	if (a[m] != b[n])
	{
	break;
	}
	}
	if (a[0] == b[0])
	{
	System.out.printf("%d\n",a[0]);
	}
	else
	{
	System.out.printf("%d\n",a[m + 1]);
	}
	}


}

