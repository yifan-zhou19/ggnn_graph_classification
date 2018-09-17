package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int k = 0;
		int n;
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
	b[i] = 1;
	}
	for (i = n - 1;i >= 0;i--)
	{
		k = 0;
	for (j = n - 1;j > i;j--)
	{
		if (a[i] >= a[j] != 0 && b[j] > k)
		{
		k = b[j];
	b[i] = b[j] + 1;
		}
	}
	}
	k = b[0];
	for (i = 0;i < n;i++)
	{
		if (b[i] > k)
		{
	k = b[i];
		}
	}
	System.out.printf("%d",k);
	}
}

