package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   float[] m = new float[50];
	   float[] f = new float[50];
	   float heigh;
	   int mm = 0;
	   int fm = 0;
	   String name = new String(new char[10]);
	   int k;
	   float temp;
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
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				heigh = Float.parseFloat(tempVar3);
			}
			if (name.charAt(0) == 'm')
			{
				  m[mm] = heigh;
				  k = mm;
				  while ((m[k] < m[k - 1]) && k>0)
				  {
						temp = m[k];
						m[k] = m[k - 1];
						m[k - 1] = temp;
						k--;
				  }
				  mm++;
			}
			else
			{
				  f[fm] = heigh;
				  k = fm;
				  while ((f[k] < f[k - 1]) && k>0)
				  {
						temp = f[k];
						f[k] = f[k - 1];
						f[k - 1] = temp;
						k--;
				  }
				  fm++;
			}
	   }
	   for (i = 0;i < mm;i++)
	   {
		   System.out.printf("%.2f ",m[i]);
	   }
	   for (i = fm - 1;i > 0;i--)
	   {
		   System.out.printf("%.2f ",f[i]);
	   }
	   System.out.printf("%.2f\n",f[0]);
	   return 0;
	}
}

