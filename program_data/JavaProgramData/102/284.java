package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[] a = {'m', 'a', 'l', 'e', '\0'};
	char[] b = {'f', 'e', 'm', 'a', 'l', 'e', '\0'};
	String c = new String(new char[7]);
	int n;
	int i;
	int j;
	int k;
	int l;
	float[] sz = new float[40];
	float[] nz = new float[40];
	float d;
	float e;
	float f;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	k = l = 0;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Float.parseFloat(tempVar3);
		}
		//scanf("%f",&d);
		if (c.charAt(0) == a[0])
		{
			sz[k] = d;
			k++;
		}
		else
		{
			nz[l] = d;
			l++;
		}
	}
	for (i = 0;i < k;i++)
	{
		for (j = i + 1;j < k;j++)
		{
			if (sz[i] > sz[j])
			{
				e = sz[i];
				sz[i] = sz[j];
				sz[j] = e;
			}
		}
	}
	for (i = 0;i < l;i++)
	{
		for (j = i + 1;j < l;j++)
		{
			if (nz[i] < nz[j])
			{
				f = nz[i];
				nz[i] = nz[j];
				nz[j] = f;
			}
		}
	}
	for (i = 0;i < k;i++)
	{
		System.out.printf("%.2f ",sz[i]);
	}
	for (j = 0;j < l - 1;j++)
	{
		System.out.printf("%.2f ",nz[j]);
	}
	System.out.printf("%.2f",nz[l - 1]);




	return 0;
	}
}

