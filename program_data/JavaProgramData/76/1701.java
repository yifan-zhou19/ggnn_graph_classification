package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[10000];
		int n;
		int p;
		int q;
		int k;
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
		for (i = 0;i < 10000;i++)
		{
			c[i] = 0;
		}
		for (i = 0,k = 0;i < n;i++)
		{
			for (j = a[i];1;1)
			{
				if (a[i] == b[i])
				{
					break;
				}
				if (c[j] == 0)
				{
					c[j] = 1;
					k++;
				}
				j++;
			if (j >= b[i])
			{
				break;
			}
			}
		}
	for (i = 0,p = a[0],q = b[0];i < n;i++)
	{
		if (a[i] < p)
		{
			p = a[i];
		}
		if (b[i] > q)
		{
			q = b[i];
		}
	}
	if (q - p == k)
	{
	System.out.printf("%d %d",p,q);
	}
	else
	{
	System.out.print("no");
	}




			return 0;
	}



}

