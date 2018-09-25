package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int[] a = new int[20000];
	int[] b = new int[20000];

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

	b[0] = a[0];
	for (i = 0;i < n;i++)
	{
	for (j = i + 1;j < n;j++)
	{
			if (a[i] == a[j])
			{
		a[j] = 0;
			}
	}
	}

	j = 0;
	for (i = 0;i < n;i++)
	{
		if (a[i] == 0)
		{
			;
		}
	else
	{
		b[j] = a[i];
		j++;
	}
	}

	for (i = 0;i < j - 1;i++)
	{
		System.out.printf("%d ",b[i]);
	}
	System.out.printf("%d",b[j - 1]);

	}
}

