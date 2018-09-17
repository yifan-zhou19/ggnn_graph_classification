package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int i;
		int j = 1;
		int k = 1;
		int o;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[45]);
		double[] p = new double[45];
		double[] q = new double[45];
		double[] r = new double[45];

			String sex = new String(new char[45]);
			double[] h = new double[45];

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			if (sex.charAt(0) == 'm')
			{
				p[j] = h[i];
				j++;
			}
			else
			{
				q[k] = h[i];
				k++;
			}
		}

		for (i = 0;i < n;i++)
		{

		}
		for (l = 1;l <= j - 1;l++)
		{
			for (i = 1;i < j - l;i++)
			{
				if (p[i] > p[i + 1])
				{
					e = p[i + 1];
					p[i + 1] = p[i];
					p[i] = e;
				}
			}
		}
		for (l = 1;l <= k - 1;l++)
		{
			for (i = 1;i < k - l;i++)
			{
				if (q[i] < q[i + 1])
				{
					e = q[i + 1];
					q[i + 1] = q[i];
					q[i] = e;
				}
			}
		}
		for (i = 1;i <= j - 1;i++)
		{
			r[i] = p[i];
		}
		o = 1;
		for (i = j;i <= n;i++)
		{
			r[i] = q[o];
			o++;
		}
		for (i = 1;i < n;i++)
		{
			System.out.printf("%.2lf ",r[i]);
		}
		if (i == n)
		{
			System.out.printf("%.2lf",r[i]);
		}
		return 0;
	}

}

