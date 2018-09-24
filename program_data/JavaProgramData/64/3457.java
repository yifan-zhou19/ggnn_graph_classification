public class twopoint
{
	public float[] a1 = new float[3];
	public float[] a2 = new float[3];
	public float c;
}

package <missing>;

public class GlobalMembers
{
	public static twopoint[] b = tangible.Arrays.initializeWithDefaulttwopointInstances(45);
	public static float[][] a = new float[10][3];
	public static int select(float[] b, int n)
	{
		int i;
		int j;
		int c;
		for (i = 0;i < n;i++)
		{
			c = 0;
		for (j = 0;j < 3;j++)
		{
			if (b[j] == a[i][j])
			{
				c++;
			}
		}
			if (c == 3)
			{
				return (i);
			}
		}
	}
	public static void selectsort(twopoint[] b, int n, int m)
	{
		int i;
		int j;
		int k;
		int i1;
		int j1;
		float[] d = new float[4];
		twopoint temp = new twopoint();
		for (i = 0;i < n;i++)
		{
			d[3] = 0F;
		for (j = 0;j < 3;j++)
		{
			d[j] = b[i].a1[j] - b[i].a2[j];
			d[j] = d[j] * d[j];
			d[3] += d[j];
		}
		b[i].c = Math.sqrt(d[3]);
		}
		for (i = 0;i < n - 1;i++)
		{
	k = i;
	for (j = i + 1;j < n;j++)
	{
	if (b[j].c > b[k].c)
	{
		k = j;
	}
	else if (b[j].c == b[k].c)
	{
		i1 = select(b[j].a1, m);
		j1 = select(b[k].a1, m);
		if (i1 < j1)
		{
			k = j;
		}
		if (i1 == j1)
		{
		i1 = select(b[j].a2, m);
		j1 = select(b[k].a2, m);
		if (i1 < j1)
		{
			k = j;
		}
		}
	}
	}

	if (k != i)
	{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=b[k];
		temp.copyFrom(b[k]);
		b[k] = b[i];
		b[i] = temp;
	}
		}
	}
	public static int Main()
	{
	int n1;
	int n2;
	int i;
	int j;
	int k;
	int l = 0;
	int l1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n1 = Integer.parseInt(tempVar);
	}
	k = (n1 - 1) * n1 / 2;
	n2 = n1;
	for (i = 0;i < n1;i++)
	{
		for (j = 0;j < 3;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][j] = Float.parseFloat(tempVar2);
			}
		}
	}
		i = 0;
		while (--n2 > 0)
		{
			l1 = l;
		for (;l < l1 + n2;l++)
		{
			for (j = 0;j < 3;j++)
			{
				b[l].a1[j] = a[i][j];
			}
		}
			i++;
		}
		n2 = n1;
		l = 0;
		i = 0;
		while (--n2 > 0)
		{
			l1 = l;
			i++;
		for (;l < l1 + n2;l++)
		{
		for (j = 0;j < 3;j++)
		{
				b[l].a2[j] = a[l - l1 + i][j];
		}
		}
		}
		selectsort(b, k, n1);
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%g,%g,%g)-(%g,%g,%g)=%0.2f\n",b[i].a1[0],b[i].a1[1],b[i].a1[2],b[i].a2[0],b[i].a2[1],b[i].a2[2],b[i].c);
		}
	}

}

