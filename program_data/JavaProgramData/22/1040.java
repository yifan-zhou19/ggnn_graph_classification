package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char c;
	int[] a = new int[300];
	int max = 0;
	int d = -1;
	int i = 0;
	int b;
	for (i = 0;;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	if (c != ',')
	{
		break;
	}
	}
	b = i;
	i = 1;
	max = a[0];
	for (i = 1;i <= b;i++)
	{
	if (a[i] > max)
	{
		d = max;
		max = a[i];
	}
	else if (a[i] < max && a[i]> d)
	{
		d = a[i];
	}
	}
	if (d == -1)
	{
		System.out.print("No");
	}
	else
	{
		System.out.printf("%d",d);
	}
	return 0;
	}
}

