package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int p = 0;
		int l = 0;
		int L;
		int K;
		int k = 0;
		int j;
		double[] m = new double[1000];
		double[] f = new double[1000];
		double[] h = new double[1000];
		double t;
		char[][] sex = new char[1000][10];
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
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(sex[i],"male") == 0)
			{
			m[l] = h[i];
			l++;
			}
			else
			{
			f[k] = h[i];
			k++;
			}
		}
		L = l,K = k;
		  for (j = 0;j < L;j++)
		  {
			  for (i = 0;i < L - 1 - j;i++)
			  {
				   if (m[i] > m[i + 1])
				   {
					   t = m[i];
					   m[i] = m[i + 1];
					   m[i + 1] = t;
				   }
			  }
		  }
		 System.out.printf("%.2lf",m[0]);
		 for (i = 1;i < L;i++)
		 {
			System.out.printf(" %.2lf",m[i]);
		 }
		for (j = 0;j < K;j++)
		{
			  for (i = 0;i < K - 1 - j;i++)
			  {
				   if (f[i] < f[i + 1])
				   {
					   t = f[i];
					   f[i] = f[i + 1];
					   f[i + 1] = t;
				   }
			  }
		}
		 for (i = 0;i < K;i++)
		 {
			System.out.printf(" %.2lf",f[i]);
		 }
			return 0;
	}

}

