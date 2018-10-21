package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j = 0;
		  int k = 0;
		  int m;
		  float[] a = new float[40];
		  float d;
		  char[][] c = new char[40][7];
		  String b = new String(new char[7]);
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
							  c[i] = tempVar2.charAt(0);
						  }
						  if (strcmp(c[i],"male") == 0)
						  {
						  j++;
						  }
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  a[i] = Float.parseFloat(tempVar3);
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (strcmp(c[i],"male") == 0)
						  {
										  b = c[i];
										  c[i] = c[k];
										  c[k] = b;
										  d = a[i];
										  a[i] = a[k];
										  a[k] = d;
										  k++;
						  }
		  }
		  for (i = 0;i < j - 1;i++)
		  {
							for (m = 0;m < j - i - 1;m++)
							{
												if (a[m] > a[m + 1])
												{
															   d = a[m + 1];
															   a[m + 1] = a[m];
															   a[m] = d;
												}
							}
		  }
		  for (i = j;i < n - 1;i++)
		  {
							for (m = j;m < n - i + j - 1;m++)
							{
												  if (a[m] < a[m + 1])
												  {
																 d = a[m + 1];
																 a[m + 1] = a[m];
																 a[m] = d;
												  }
							}
		  }
		  System.out.printf("%.2f",a[0]);
		  for (i = 1;i < n;i++)
		  {
		  System.out.printf(" %.2f",a[i]);
		  }

	}
}

