package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[40];
		double[] hei = new double[40];
		double[] nan = new double[40];
		double[] nv = new double[40];
		String b = new String(new char[7]);
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
				b = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				hei[i] = Double.parseDouble(tempVar3);
			}
			if (b.charAt(0) == 'm')
			{
				a[i] = 1;
			}
			else
			{
				a[i] = 0;
			}
		}
		int k;
		int l;
		k = 0;
		l = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] == 1)
			{
				nan[k] = hei[i];
				k++;
			}
			else
			{
				nv[l] = hei[i];
				l++;
			}
		}
		int x;
		int y;
		double e;
		for (x = 1;x < k;x++)
		{
			for (y = 0;y < k - x;y++)
			{
				if (nan[y] > nan[y + 1])
				{
				e = nan[y];
				nan[y] = nan[y + 1];
				nan[y + 1] = e;
				}
			}
		}
		for (x = 0;x < k;x++)
		{
			System.out.printf("%.2lf ",nan[x]);
		}
		for (x = 1;x < l;x++)
		{
			for (y = 0;y < l - x;y++)
			{
				if (nv[y] < nv[y + 1])
				{
				e = nv[y];
				nv[y] = nv[y + 1];
				nv[y + 1] = e;
				}
			}
		}
		for (x = 0;x < l;x++)
		{
			if (x != (l - 1))
			{
				System.out.printf("%.2lf ",nv[x]);
			}
			else
			{
				System.out.printf("%.2lf",nv[x]);
			}
		}
		return 0;
	}
}

