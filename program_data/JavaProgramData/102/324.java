package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p = -1;
		int q = -1;
		int k;
		float[] a = new float[40];
		float[] c = new float[40];
		float[] d = new float[40];
		float g;
		char[][] b = new char[41][10];
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
					b[i] = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					a[i] = Float.parseFloat(tempVar3);
				}
		}
		for (i = 0;i < n;i++)
		{
				 if (b[i][0] == 'm')
				 {
					 p = p + 1;
					 c[p] = a[i];
				 }
				 else
				 {
					 q = q + 1;
					 d[q] = a[i];
				 }
		}
		for (k = 1;k <= p + 1;k++)
		{
				for (i = 0;i < p + 1 - k;i++)
				{
						if (c[i] > c[i + 1])
						{
							 g = c[i];
							 c[i] = c[i + 1];
							 c[i + 1] = g;
						}
				}
		}
		 for (k = 1;k <= q + 1;k++)
		 {
				for (i = 0;i < q + 1 - k;i++)
				{
						if (d[i] < d[i + 1])
						{
							 g = d[i];
							 d[i] = d[i + 1];
							 d[i + 1] = g;
						}
				}
		 }
		 for (i = 0;i <= p;i++)
		 {
			   System.out.printf("%.2f ",c[i]);
		 }
		 for (i = 0;i <= q;i++)
		 {
			  if (i != q)
			  {
			   System.out.printf("%.2f ",d[i]);
			  }
			  else
			  {
			   System.out.printf("%.2f",d[i]);
			  }
		 }
		 return 0;
	}

}

