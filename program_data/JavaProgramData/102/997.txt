package <missing>;

public class GlobalMembers
{
	public static void array(double[] A, int n)
	{
		int i;
		int j;
		int k;
		double t;
		for (i = 0;i < n;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (A[j] < A[k])
				{
					k = j;
				}
			}
			if (k != i)
			{
				t = A[k];
				A[k] = A[i];
				A[i] = t;
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m = 0;
		int l = 0;
		double h;
		double[] nan = new double[50];
		double[] nv = new double[50];
		String s = new String(new char[6]);
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
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
		if (s.charAt(0) == 'm')
		{
			nan[m] = h;
			m++;

		}
		else
		{
			nv[l] = h;
			l++;
		}
		}
	array(nan, m);
	for (i = 0;i < m;i++)
	{
		   System.out.printf("%.2lf ",nan[i]);
	}
	array(nv, l);
	for (i = l - 1;i > 0;i--)
	{
	System.out.printf("%.2lf ",nv[i]);
	}
	System.out.printf("%.2lf",nv[0]);
	  return 0;
	}
}

