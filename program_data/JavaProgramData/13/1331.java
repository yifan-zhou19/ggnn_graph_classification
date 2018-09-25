package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[200000];
	int i;
	int j;
	int b;
	int[] c = new int[101];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 101;i++)
	{
		c[i] = 0;
	}

	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		c[a[i]]++;
		if (c[a[i]] == 1)
		{
			if (i == 0)
			{
				System.out.printf("%d",a[0]);
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
		}
	}

	return 0;
	}

}

