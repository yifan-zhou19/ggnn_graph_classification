package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int[] a = new int[100];
	int[] b = new int[100];
	int[] c = new int[100];
	int j;
	int i;
	float[] d = new float[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 0;i < m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	d[i] = 0F;
	}
	b[0] = 2;
	b[1] = 3;
	c[0] = 1;
	c[1] = 2;
	for (i = 0;i < m;i++)
	{
	  j = 2;
	  if (a[i] == 1)
	  {
	  d[i] = 2.0 / 1;
	  }
	  else if (a[i] == 2)
	  {
	  d[i] = 2.0 / 1 + 3.0 / 2;
	  }
	  else
	  {
	   d[i] = 2.0 / 1 + 3.0 / 2;
	   while (j < a[i])
	   {
		  b[j] = b[j - 1] + b[j - 2];
		  c[j] = c[j - 1] + c[j - 2];
		  d[i] += b[j] * 1.0 / c[j];
		  j++;
	   }
	  }

	}
	for (i = 0;i < m;i++)
	{
	System.out.printf("%.3f\n",d[i]);
	}

	return 0;
	}
}

