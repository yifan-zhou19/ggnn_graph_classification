package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] a = new int[16];
		int[] b = new int[16];
	do
	{
		i = 0;
		k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[0] = Integer.parseInt(tempVar);
	}
	b[0] = 2 * a[0];
	if (a[0] == -1)
	{
	break;
	}
	else
	{
	do
	{
	i++;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	b[i] = 2 * a[i];
	}while (a[i] != 0);
	}
	n = i - 1;
	for (i = 0;i <= n;i++)
	{
		for (j = 0;j <= n;j++)
		{
		if (a[i] == b[j])
		{
	k++;
		}
		}
	}
	System.out.printf("%d\n",k);
	}while (1 != 0);
	}
}

