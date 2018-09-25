package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int p;
		  int n1;
		  int n2;
		  String s = new String(new char[10]);
		  double c;
		  double t;
		  double[] a = new double[100];
		  double[] b = new double[100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  n1 = 0;
		  n2 = 0;
		  for (i = 1;i <= n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  t = Double.parseDouble(tempVar3);
			  }
			  if (s.charAt(0) == 'm')
			  {
				  n1++;
				  a[n1] = t;
			  }
			  else
			  {
				  n2++;
				  b[n2] = t;
			  }
		  }

		  for (i = 1;i <= n1 - 1;i++)
		  {
			  p = i;
		   for (j = i + 1;j <= n1;j++)
		   {
		   if (a[j] < a[p])
		   {
			   p = j;
		   }
		   }
		   c = a[i];
		   a[i] = a[p];
		   a[p] = c;
		  }

		   /*for (i=1;i<=n1;i++) printf("%.2lf ",a[i]);*/

		   for (i = 1;i <= n2 - 1;i++)
		   {
			  p = i;
		   for (j = i + 1;j <= n2;j++)
		   {
		   if (b[j] > b[p])
		   {
			   p = j;
		   }
		   }
		   c = b[i];
		   b[i] = b[p];
		   b[p] = c;
		   }

		   for (i = 1;i <= n1;i++)
		   {
			   System.out.printf("%.2lf ",a[i]);
		   }
		   for (i = 1;i <= n2;i++)
		   {
			   if (i < n2)
			   {
				   System.out.printf("%.2lf ",b[i]);
			   }
			   else
			   {
				   System.out.printf("%.2lf\n",b[i]);
			   }
		   }

	}


}

