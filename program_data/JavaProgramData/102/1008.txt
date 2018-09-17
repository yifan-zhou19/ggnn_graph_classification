package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		float[] a = new float[42];
		float k;
		float b;
		String l = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int na = 0;
		int nv = n;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				l = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
			if (l.charAt(0) == 'm')
			{
				a[na] = b;
				na++;
			}
			else
			{
				a[nv] = b;
				nv--;
			}
		}
		for (i = 0;i < na - 1;i++)
		{
			for (j = i;j < na;j++)
			{
				if (a[i] > a[j])
				{
					k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}
			System.out.printf("%.2f ",a[i]);
		}
		System.out.printf("%.2f ",a[na - 1]);
		for (i = n;i > nv + 1;i--)
		{
			for (j = i;j > nv;j--)
			{
				if (a[i] > a[j])
				{
					k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}
		}
		for (i = nv + 1;i < n;i++)
		{
			System.out.printf("%.2f ",a[i]);
		}
		System.out.printf("%.2f",a[n]);


		return 0;
	}
}

