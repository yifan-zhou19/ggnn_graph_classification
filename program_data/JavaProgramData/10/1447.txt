package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int i;
	int j;
	int[] a = new int[25];
	int[] b = new int[25];
	int max;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (j = k - 1;j >= 0;j--)
	{
		max = 0;
		for (i = j + 1;i < k;i++)
		{
			if (a[i] <= a[j])
			{
			 if (b[i] > max)
			 {
			 max = b[i];
			 }
			}
		}
		b[j] = max + 1;
	}
	for (i = 0;i < k;i++)
	{
		if (b[i] > max)
		{
			max = b[i];
		}
	}
	System.out.printf("%d",max);

	return 0;
	}
}

