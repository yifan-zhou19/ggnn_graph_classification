package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] m = new int[20];
		int[] n = new int[20];
		int i;
		int j;
		int k;
		int p;
		int q;
		int b;
		int c;
		int[] x = new int[300];
		int y;
		int e;
	for (k = 0;;k++)
	{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[k] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[k] = Integer.parseInt(tempVar2);
			}
	if (m[k] == 0)
	{
		break;
	}
	}
	for (i = 0;i < k;i++)
	{
		j = 0;
		for (j = 0;j < n[i];j++)
		{
		a[j] = j + 1;
		}
	for (;n[i] > 1;n[i]--)
	{
		p = m[i] % n[i];
	c = n[i] - p;
	for (y = 0,b = 0;b < p - 1;b++,y++)
	{
		x[y] = a[b];
	}

	for (e = 0;p < n[i];e++,p++)
	{
		a[e] = a[p];
	}
	for (q = 0;c < n[i] - 1;c++,q++)
	{
		a[c] = x[q];
	}
	}


	System.out.printf("%d\n",a[0]);
	}
	}


}

