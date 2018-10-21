package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int k = 0;
		 int j;
		 float[] a = new float[300];
		 float[] b = new float[300];
		 float[] c = new float[300];
		 float m = 0F;
		 float t;
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
						   a[i] = Float.parseFloat(tempVar2);
					   }
	m = m + a[i];
	}
	m = m / n;
	for (i = 0;i < n;i++)
	{
		b[i] = Math.abs(a[i] - m);
	}
	t = b[0];
	for (i = 1;i < n;i++)
	{
		if (b[i] > t)
		{
			t = b[i];
		}
	}
	for (i = 0;i < n;i++)
	{
		if (b[i] == t)
		{
			c[k] = a[i];
			k++;
		}
	}
	if (k == 1)
	{
		System.out.printf("%.0f",c[0]);
	}
	if (k > 1)
	{


		for (j = k - 1;j > 0;j--)
		{
										 for (i = 0;i < j;i++)
										 {
														  if (a[i] > a[i + 1])
														  {
																		  t = c[i];
																		  a[i] = c[i + 1];
																		  c[i + 1] = t;

														  }
										 }
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%.0f,",c[i]);
		}
		System.out.printf("%.0f",c[k - 1]);
	}


				return 0;
	}
}

