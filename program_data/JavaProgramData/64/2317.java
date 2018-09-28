package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j;
		int k;
		int[] x = new int[110];
		int[] y = new int[110];
		int[] z = new int[110];
		int[] a = new int[500];
		int[] aa = new int[500];
		int[] b = new int[500];
		int[] bb = new int[500];
		int[] c = new int[500];
		int[] cc = new int[500];
		int l;
		double[] s = new double[110];
		double ty;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 x[i] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 y[i] = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 z[i] = Integer.parseInt(tempVar4);
			 }
		 }

		for (i = 0;i < n - 1;i++)
		{
		   for (j = i + 1;j < n;j++)
		   {
			   s[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
			 a[k] = (x[i]);
			 b[k] = (y[i]);
			 c[k] = (z[i]);
			 aa[k] = (x[j]);
			 bb[k] = (y[j]);
			 cc[k] = (z[j]);

			   k++;
		   }
		}

			   for (i = k - 1;i > 0;i--)
			   {
		   for (j = 0;j < i;j++)
		   {
			 if (s[j + 1] > s[j])
			 {
				 ty = s[j + 1];

				 s[j + 1] = s[j];
				 s[j] = ty;
				  t = a[j + 1];
				 a[j + 1] = a[j];
				 a[j] = t;
				  t = b[j + 1];
				 b[j + 1] = b[j];
				 b[j] = t;
				  t = c[j + 1];
				 c[j + 1] = c[j];
				 c[j] = t;
				  t = aa[j + 1];
				 aa[j + 1] = aa[j];
				 aa[j] = t;
				  t = bb[j + 1];
				 bb[j + 1] = bb[j];
				 bb[j] = t;
				  t = cc[j + 1];
				 cc[j + 1] = cc[j];
				 cc[j] = t;
			 }
		   }
			   }

			 for (i = 0;i < k;i++)
			 {
			 System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i],b[i],c[i],aa[i],bb[i],cc[i],s[i]);
			 }
		  return 0;
	}





}

