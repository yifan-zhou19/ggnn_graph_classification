package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int[] a = new int[1000];
	int[] b = new int[1000];
	int n = 0;
	int t;
	int maxt = 0;
	int[] t1 = new int[1000];
	int max = 0;
	char c;
	for (i = 0;;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		n++;
		if (c != ',')
		{
		break;
		}
	}
	for (i = 0;;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(null, 1);
		if (tempVar4 != null)
		{
			c = tempVar4.charAt(0);
		}
		if (b[i] > maxt)
		{
		maxt = b[i];
		}
		if (c != ',')
		{
		break;
		}
	}
	for (t = 0;t < maxt;t++)
	{
		for (i = 0;i < n;i++)
		{
		if ((t >= a[i]) && (t < b[i]))
		{
		t1[t]++;
		}
		}
	}
	for (t = 0;t < maxt;t++)
	{
		if (max < t1[t])
		{
		max = t1[t];
		}
	}
		System.out.printf("%d %d",n,max);
	return 0;
	}

}

