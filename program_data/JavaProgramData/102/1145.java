package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] zfc = new char[1000][7];
		double[] sg = new double[100];
		double[] nsg = new double[100];
		double[] nvsg = new double[100];
		int nsm = 0;
		int nvsm = 0;
		int k;
		int i;
		int e = 0;
		int s = 0;
		double r;
		double t;
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
				zfc[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sg[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (zfc[i][0] == 'm')
			{
				nsm = nsm + 1;
				e = e+1;
				nsg[e-1] = sg[i];
			}
			else if (zfc[i][0] == 'f')
			{
				nvsm = nvsm + 1;
				s = s + 1;
				nvsg[s - 1] = sg[i];
			}
		}
		for (k = 0;k < nsm;k++)
		{
			for (i = 0;i < nsm - 1 - k;i++)
			{
				if (nsg[i] > nsg[i + 1])
				{
						r = nsg[i + 1];
						nsg[i + 1] = nsg[i];
						nsg[i] = r;
				}
			}
		}
		for (k = 0;k < nvsm;k++)
		{
			for (i = 0;i < nvsm - 1 - k;i++)
			{
				if (nvsg[i] < nvsg[i + 1])
				{
						t = nvsg[i + 1];
						nvsg[i + 1] = nvsg[i];
						nvsg[i] = t;
				}
			}
		}
		for (i = 0;i < nsm;i++)
		{
			System.out.printf("%.2lf ",nsg[i]);
		}
		for (i = 0;i < nvsm - 1;i++)
		{
			System.out.printf("%.2lf ",nvsg[i]);
		}
		System.out.printf("%.2lf",nvsg[nvsm - 1]);
		return 0;
	}

}

