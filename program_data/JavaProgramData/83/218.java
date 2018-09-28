package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sum2 = 0;
		int[] b = new int[100];
	 float[] c = new float[100];
	 float[] a = new float[100];
	 float GPA;
	 float sum1 = 0F;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	for (i = 0;i <= (n - 1);i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Float.parseFloat(tempVar2);
	}
	}
	for (i = 0;i <= (n - 1);i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i <= (n - 1);i++)
	{
		if (b[i] >= 90)
		{
			c[i] = 4.0 * a[i];
		}
	else
	{
		if (b[i] >= 85)
		{
			c[i] = 3.7 * a[i];
		}
	else
	{
		if (b[i] >= 82)
		{
			c[i] = 3.3 * a[i];
		}
	else
	{
		if (b[i] >= 78)
		{
			c[i] = 3.0 * a[i];
		}
	else
	{
		if (b[i] >= 75)
		{
			c[i] = 2.7 * a[i];
		}
	else
	{
		if (b[i] >= 72)
		{
			c[i] = 2.3 * a[i];
		}
	else
	{
		if (b[i] >= 68)
		{
			c[i] = 2.0 * a[i];
		}
	else
	{
		if (b[i] >= 64)
		{
			c[i] = 1.5 * a[i];
		}
	else
	{
		if (b[i] >= 60)
		{
			c[i] = 1.0 * a[i];
		}
	  else
	  {
		  c[i] = 0F;
	  }
	}
	}
	}
	}
	}
	}
	}
	}
	}
	for (i = 0;i <= (n - 1);i++)
	{
	sum1 = sum1 + c[i];
	}
	for (i = 0;i <= (n - 1);i++)
	{
	sum2 = sum2 + a[i];
	}
	GPA = sum1 / sum2;
	System.out.printf("%.2f",GPA);
	}
}

