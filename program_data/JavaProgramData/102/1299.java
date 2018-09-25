package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int t;
		  String s = new String(new char[7]);
		  double[] a = new double[40];
		  double[] b = new double[40];
		  double p;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  j = 0;
		  k = 0;
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s = tempVar2.charAt(0);
			  }
			  if (strcmp(s,"male") == 0)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  a[j] = Double.parseDouble(tempVar3);
				  }
				  j++;
			  }
			  if (strcmp(s,"female") == 0)
			  {
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  b[k] = Double.parseDouble(tempVar4);
				  }
				  k++;
			  }
		  }
		  for (i = j - 1;i > 0;i--)
		  {
			  for (t = 0;t < i;t++)
			  {
				  if (a[t] > a[t + 1])
				  {
					  p = a[t];
					  a[t] = a[t + 1];
					  a[t + 1] = p;
				  }
			  }
		  }
		  for (i = k - 1;i > 0;i--)
		  {
			  for (t = 0;t < i;t++)
			  {
				  if (b[t] < b[t + 1])
				  {
					  p = b[t];
					  b[t] = b[t + 1];
					  b[t + 1] = p;
				  }
			  }
		  }
		  for (i = 0;i < j;i++)
		  {
		  System.out.printf("%.2f ",a[i]);
		  }
		  for (i = 0;i < k;i++)
		  {
			  if (i == k - 1)
			  {
				  System.out.printf("%.2f",b[k - 1]);
			  }
			  else
			  {
				  System.out.printf("%.2f ",b[i]);
			  }
		  }
	}

}

