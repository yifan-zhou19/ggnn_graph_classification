package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[91];
		  int m;
		  int i;
		  int j;
		  int n;
		  int k;
		  int l;
		  int t;
		  a[1] = 2;
		  a[2] = 3;
		  a[3] = 5;
		  a[4] = 7;
		  n = 4; // ??????
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (i = 11;i <= m;i++)
		  {
							t = 0;
							for (j = 1;j <= n;j++)
							{
											 if (i % a[j] == 0)
											 {
												 t = 1;
											 }
							}
							if (t == 0)
							{
								   n++;
								   a[n] = i;
							}
		  }
		  i = 1;
		  while (a[i] <= m / 2)
		  {
						  for (j = 1;j <= n;j++)
						  {
										   if (a[i] + a[j] == m)
										   {
											   System.out.printf("%d %d\n",a[i],a[j]);
										   }
						  }
						  i++;
		  }
	}
}

