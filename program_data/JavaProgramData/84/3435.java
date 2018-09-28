package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int l;
		int big;
		int smaller;
		int[] a = new int[10011];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		i = n - 1;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}

		big = a[0];
		smaller = a[0];
		for (j = 1;j < n;j++)
		{
			if (a[j] >= big)
			{
				big = a[j];
			}
		}
		for (l = 0;l < n;l++)
		{
			if (a[l] >= smaller != 0 && a[l] < big)
			{
				smaller = a[l];
			}
		}

		System.out.printf("%d\n%d",big,smaller);
	}
}

