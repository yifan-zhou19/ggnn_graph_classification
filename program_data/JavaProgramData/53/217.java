package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int k = 0;
		int t = 0;
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
		}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < i;j++)
		{
	if (a[j] == a[i])
	{
		a[i] = 0;
		k++;
	}
		}
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] != 0)
		{
		if (t > 0)
		{
			System.out.print(",");
		}
		System.out.printf("%d",a[i]);
		t++;

		}
	}
	}
}

