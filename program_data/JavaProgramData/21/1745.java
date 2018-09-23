package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int[] a = new int[400];
	   int i;
	   int j;
	   int n;
	   int l;
	   int s = 0;
	   int t = 0;
	   int r;
	   float x;
	   float z;
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
			s = s + a[i];
	   }
	   for (i = 0;i < n;i++)
	   {
		  for (j = i + 1;j < n;j++)
		  {
			  if (a[j] < a[i])
			  {
				  l = a[i];
				  a[i] = a[j];
				  a[j] = l;
			  }
		  }
	   }
	   x = (float)s / (float)n;
	   z = (float)a[0] + (float)a[n - 1] - 2 * x;
	   if (z < 0.001F && z>-0.001F)
	   {
		  for (i = 0;i < n;i++)
		  {
			  if (a[i] == a[0] || a[i] == a[n - 1])
			  {
				   if (t == 1)
				   {
				   System.out.print(",");
				   }
				   System.out.printf("%d",a[i]);
				   t = 1;
			  }
		  }
	   }
		else
		{
		   t = 0;
		   r = z > 0F?a[n - 1]:a[0];
		   for (i = 0;i < n;i++)
		   {
			  if (a[i] == r)
			  {
				   if (t == 1)
				   {
				   System.out.print(",");
				   }
				   System.out.printf("%d",a[i]);
				   t = 1;
			  }
		   }
		}
	}

}

