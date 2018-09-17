package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int J;
		int K;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] xb = new char[40][7];
		double[] h = new double[40];
		double[] hm = new double[40];
		double[] hf = new double[40];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xb[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			if (String.valueOf(xb[i]).length() == 4)
			{
				hm[j] = h[i];
				j++;
				J = j;
			}
			else
			{
				hf[k] = h[i];
				k++;
				K = k;
			}
		}
		//printf("%lf",hm[1]);
		//printf("%d %d",j,k);
		double e;
		for (p = 1;p <= J;p++)
		{
			for (j = 0;j < J - 1;j++)
			{
			if (hm[j] > hm[j + 1])
			{
				e = hm[j + 1];
				hm[j + 1] = hm[j];
				hm[j] = e;
			}
			//printf("%.2lf\n",hm[j]);
			}
		}
		//printf("%lf",hm[2]);
		for (p = 1;p <= K;p++)
		{
			for (k = 0;k < K - 1;k++)
			{
		  if (hf[k] < hf[k + 1])
		  {
				e = hf[k + 1];
				hf[k + 1] = hf[k];
				hf[k] = e;
		  }
			}
		}
		for (j = 0;j < J;j++)
		{
			System.out.printf("%.2lf ",hm[j]);
			//printf("hehe");
		}
		for (k = 0;k < K - 1;k++)
		{
			System.out.printf("%.2lf ",hf[k]);
		}
		System.out.printf("%.2lf",hf[K - 1]);
		//scanf("%d",&n);
		return 0;
	}
}

