package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] a = new int[305];
		char c;
	for (i = 1;;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
	c = System.in.read();
	if (c == '\n')
	{
		break;
	}
	}
	if (i == 1)
	{
		System.out.print("No");
	}
	else
	{
	for (j = 1;j <= i - 1;j++)
	{
	for (k = 1;k <= i - j;k++)
	{
	if (a[k] > a[k + 1])
	{
		n = a[k];
		a[k] = a[k + 1];
		a[k + 1] = n;
	}
	}
	}
	if (a[1] == a[i])
	{
		System.out.print("No");
	}
	else
	{
		for (j = i - 1;;j--)
		{
	if (a[j] != a[i])
	{
		break;
	}
		}
	System.out.printf("%d",a[j]);
	}
	}
	return 0;
	}
}

