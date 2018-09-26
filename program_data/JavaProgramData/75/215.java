package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n = 0;
		int n1 = 0;
		int mid;
	int min1 = 1000;
	int max1 = 0;
	int min2 = 1000;
	int max2 = 0;
	int[] d = new int[1000];
	int t = 0;
	int max = 0;
	char c;
	for (;;)
	{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n1++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c != ',')
			{
				break;
			}
	}

	//n1??
	for (;;)
	{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[n++] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			if (c != ',')
			{
				break;
			}
	}

	for (i = 0;i < n1;i++)
	{
				if (a[i] > max1)
				{
					max1 = a[i];
				}
	if (b[i] > max2)
	{
					max2 = b[i];
	}
						if (a[i] < min1)
						{
					min1 = a[i];
						}
	if (b[i] < min2)
	{
					min2 = b[i];
	}

	}
	for (i = min1;i <= max2;i++)
	{
		for (j = 0;j < n1;j++)
		{
		if (a[j] <= i != 0 && b[j]> i)
		{
	d[t]++;
		}
		}
	t++;
	}

	for (i = 0;i < t;i++)
	{
		if (d[i] > max)
		{
					max = d[i];
		}
	}
	System.out.printf("%d %d",n1,max);





	return 0;

	}
}

