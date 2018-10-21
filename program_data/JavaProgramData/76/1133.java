package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
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
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < n;i++)
			{
				for (k = i + 1;k < n;k++)
				{
					if (a[i] > a[k])
					{
					m = a[i];
					a[i] = a[k];
					a[k] = m;
					m = b[i];
					b[i] = b[k];
					b[k] = m;
					}
				}
			}
	for (i = 0;i < n - 1;i++)
	{
		if (b[i] < a[i + 1])
		{
		System.out.print("no");
		break;
		}
		else
		{
			if (b[i] > b[i + 1])
			{
				m = b[i];
					b[i] = b[i + 1];
					b[i + 1] = m;
			}
		}
	}
	if (i == n - 1)
	{
		System.out.printf("%d %d",a[0],b[n - 1]);
	}
	return 0;
	}

}

