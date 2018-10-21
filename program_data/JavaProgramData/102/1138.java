package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int p = 0;
		int ab;
		int ba;
		double[] h = new double[100];
		double[] h1 = new double[100];
		double[] h2 = new double[100];
		double temp;
		String s = new String(new char[100]);
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
				h[i] = Double.parseDouble(tempVar3);
			}
			ab = strcmp(s,"female");
			ba = strcmp(s,"male");
			if (ba == 0)
			{
				h1[k] = h[i];
				k++;
			}
			if (ab == 0)
			{
				h2[p] = h[i];
				p++;
			}
		}


		for (i = k - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (h1[j] > h1[j + 1])
				{
					temp = h1[j];
					h1[j] = h1[j + 1];
					h1[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.2lf ",h1[i]);
		}
		for (i = p;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (h2[j] < h2[j + 1])
				{
					temp = h2[j];
					h2[j] = h2[j + 1];
					h2[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < p - 1;i++)
		{
			System.out.printf("%.2lf ",h2[i]);
		}
		System.out.printf("%.2lf",h2[p - 1]);


		return 0;
	}

}

