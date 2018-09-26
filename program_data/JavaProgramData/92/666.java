package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[1001];
		  int[] b = new int[1001];
		  int i;
		  int n;
		  int t;
		  int u;
		  int j;
		  int k;
		  int s;
		  int v;
		  int f1;
		  int f2;
		  int s1;
		  int s2;
		  do
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n != 0)
		  {
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Integer.parseInt(tempVar2);
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  b[i] = Integer.parseInt(tempVar3);
						  }
		  }
		  t = 0;
		  u = 0;
		  for (j = n;j > 1;j--)
		  {
						  for (k = 0;k < j - 1;k++)
						  {
							if (a[k + 1] > a[k])
							{
										   t = a[k];
										   a[k] = a[k + 1];
										   a[k + 1] = t;
							}
							if (b[k + 1] > b[k])
							{
										   u = b[k];
										   b[k] = b[k + 1];
										   b[k + 1] = u;
							}
						  }
		  }
		  v = 0;
		  int f1 = 0;
		  int f2 = 0;
		  int s1 = n - 1;
		  int s2 = n - 1;
		  while (f1 != s1 && f2 != s2)
		  {
		  if (a[f1] > b[f2])
		  {
			  v += 200;
			  f1++;
			  f2++;
		  }
		  if (a[f1] < b[f2])
		  {
			  v -= 200;
			  f2++;
			  s1--;
		  }
		  if (a[f1] == b[f2])
		  {
			   if (a[s1] > b[s2])
			   {
					v += 200;
					s1--;
					s2--;
			   }
			   else
			   {
				   if (a[s1] <= b[s2])
				   {
					if (a[s1] < b[f2])
					{
						v -= 200;
					s1--;
					f2++;
					}
					else if (a[s1] == b[f2])
					{
					s1--;
					f2++;
					}
				   }
			   }
		  }
		  }
		  if (a[f1] > b[f2])
		  {
		  v += 200;
		  }
		  else if (a[f1] < b[f2])
		  {
		  v -= 200;
		  }
		  System.out.printf("%d\n",v);
		  }
		  }while (n != 0);

	}

}

