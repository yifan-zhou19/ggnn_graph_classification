package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[300];
	int i;
	int j;
	int k;
	int l;
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
	}
	System.out.printf("%d",a[0]);
	for (i = 1;i < n;i++)
	{
		j = 0;
		while (a[i] != a[j])
		{
			j++;
		}
		if (j == i)
		{
			System.out.printf(",%d",a[i]);
		}
	}
	}
}

