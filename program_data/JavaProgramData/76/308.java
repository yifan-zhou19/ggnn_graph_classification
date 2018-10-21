package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int[] a = new int[50000];
	int[] b = new int[50000];
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}
	for (k = 1;k < n;k++)
	{
		for (i = 1;i <= n - k;i++)
		{
			if (b[0] < a[i] || a[0]> b[i])
			{
			}
			else
			{
				if (a[0] <= a[i])
				{
					a[i] = a[n - k];
					a[n - k] = 0;
				}
				else
				{
					a[0] = a[i];
					a[i] = a[n - k];
					a[n - k] = 0;
				}
				if (b[0] >= b[i])
				{
					b[i] = b[n - k];
					b[n - k] = 0;
				}
				else
				{
					b[0] = b[i];
					b[i] = b[n - k];
					b[n - k] = 0;
				}
				break;
			}
		}
	}
	if (a[1] == 0)
	{
		System.out.printf("%d %d",a[0],b[0]);
	}
	else
	{
		System.out.print("no\n");
	}
		return 0;
	}

}

