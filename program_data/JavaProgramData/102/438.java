package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] h = new double[40];
		double tmp;
		int n;
		int i;
		int j;
		int k = 0;
		String c = new String(new char[7]); //???female?6???????????????7
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
				c = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			if (c.charAt(0) == 'f')
			{
				h[i] = (-1) * h[i];
				k++;
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (h[j] > h[j + 1])
				{
					tmp = h[j + 1];
					h[j + 1] = h[j];
					h[j] = tmp;
				}
			}
		}
		for (i = k;i < n;i++)
		{
			System.out.printf("%.2lf ",h[i]);
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%.2lf ",(-1 * h[i])); //??????-h[i]
		}
		System.out.printf("%.2lf\n",(-1 * h[k - 1])); //??????????????????????
		return 0;
	}
}

