package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int[] sa = new int[11];
		int[] sb = new int[11];
		int[] sc = new int[11];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sa[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sb[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sc[i] = Integer.parseInt(tempVar4);
			}
		}

		int[] s = new int[51];
		int k;
		int[] y = new int[51];
		int[] z = new int[51];
		double[] l = new double[51];
		i = 0;
		for (j = 0;j < n - 1;j++)
		{
			   for (k = j + 1;k < n;k++)
			   {
				  s[i] = (sa[j] - sa[k]) * (sa[j] - sa[k]) + (sb[j] - sb[k]) * (sb[j] - sb[k]) + (sc[j] - sc[k]) * (sc[j] - sc[k]);
				  l[i] = Math.sqrt(s[i]);
				  y[i] = j;
				  z[i] = k; //??????

				  i++;
			   }
		}
		int e;
		int g;
		double f;
		for (k = 1;k <= i;k++)
		{
			for (j = 0;j < (i - k);j++)
			{
				if (l[j] < l[j + 1])
				{
					f = l[j];
					l[j] = l[j + 1];
					l[j + 1] = f; //????
					e = y[j];
					y[j] = y[j + 1];
					y[j + 1] = e;
					g = z[j];
					z[j] = z[j + 1];
					z[j + 1] = g; //???????
				}
			}
		}
		for (j = 0;j < i;j++)
		{

			b = y[j];
			c = z[j];
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",sa[b],sb[b],sc[b],sa[c],sb[c],sc[c],l[j]);
		}
		return 0;
	}
}

