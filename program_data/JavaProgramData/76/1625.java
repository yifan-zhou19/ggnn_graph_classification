package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int t;
	int w;
	int[] a = new int[50000];
	int[] c = new int[50000];
	int[] d = new int[50000];
	int[] e = new int[50000];
	int[] b = new int[50000];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
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
		c[i] = a[i];
		d[i] = b[i];
	}
	for (int g = 0;g < n - 1;g++)
	{
		if (c[g] < c[g + 1])
		{
			  t = c[g];
			  c[g] = c[g + 1];
			  c[g + 1] = t;
		}
		if (d[g] > d[g + 1])
		{
			  w = d[g];
			  d[g] = d[g + 1];
			  d[g + 1] = w;
		}
	}
		for (int h = c[n - 1] + 1;h < d[n - 1];h++)
		{
			e[h] = 0;

		}
	   e[d[n - 1]] = 1;
		for (int j = 0;j < n;j++)
		{
			for (int k = a[j] + 1;k <= b[j];k++)
			{
				if (e[k] == 0)
				{
				e[k] = 1;
				}
			}
		}

		for (int z = c[n - 1] + 1;z < d[n - 1] + 1;z++)
		{
			if (e[z] == 0)
			{
			System.out.print("no");
			break;
			}
			else if (z == d[n - 1])
			{
			System.out.printf("%d %d",c[n - 1],d[n - 1]);
			}
		}
			return 0;




	}

}

