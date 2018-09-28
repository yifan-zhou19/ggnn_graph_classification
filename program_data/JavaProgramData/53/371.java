package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
		int[] b = new int[300];
		int p;
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
	for (j = 0;j < i;j++)
	{
	if (a[j] == a[i])
	{
		b[i] = 1;
		break;
	}
	}
		}
	for (i = n - 1;i >= 0;i--)
	{
		if (b[i] == 0)
		{
			p = i;
			break;
		}
	}
	for (i = 0;i < p;i++)
	{
		if (b[i] == 0)
		{
			System.out.printf("%d,",a[i]);
		}
	}
	System.out.printf("%d",a[p]);
	}
}

