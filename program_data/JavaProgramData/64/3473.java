package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[101];
		int[] aa = new int[101];
		int[] aaa = new int[101];
		int[] b = new int[101];
		int[] bb = new int[101];
		int[] bbb = new int[101];
		int[] c = new int[101];
		int[] cc = new int[101];
		int[] ccc = new int[101];
		int i;
		int j;
		int k = 0;
		int n;
		int t;
		double[] d = new double[101];
		double t2;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}


		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				d[k] = Math.sqrt((a[i] - a[j + i + 1]) * (a[i] - a[j + i + 1]) + (b[i] - b[j + i + 1]) * (b[i] - b[j + i + 1]) + (c[i] - c[j + i + 1]) * (c[i] - c[j + i + 1]));

				aa[k] = a[i];
				bb[k] = b[i];
				cc[k] = c[i];
				aaa[k] = a[j + i + 1];
				bbb[k] = b[j + i + 1];
				ccc[k] = c[j + i + 1];
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
				if (d[j] < d[j + 1])
				{
					t2 = d[j];
					d[j] = d[j + 1];
					d[j + 1] = t2;
					t = aa[j];
					aa[j] = aa[j + 1];
					aa[j + 1] = t;
					t = bb[j];
					bb[j] = bb[j + 1];
					bb[j + 1] = t;
					t = cc[j];
					cc[j] = cc[j + 1];
					cc[j + 1] = t;
					t = aaa[j];
					aaa[j] = aaa[j + 1];
					aaa[j + 1] = t;
					t = bbb[j];
					bbb[j] = bbb[j + 1];
					bbb[j + 1] = t;
					t = ccc[j];
					ccc[j] = ccc[j + 1];
					ccc[j + 1] = t;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",aa[i],bb[i],cc[i],aaa[i],bbb[i],ccc[i],d[i]);
		}

	}

}

