package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[1010];
	int[] b = new int[1010];
	int[] d = new int[1010];
	int max1 = 2000;
	int max2 = 0;
	int max = 0;
	int t;
	int i;
	int n = 0;
	char c;
	for (i = 1;;i++)
	{
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  a[i] = Integer.parseInt(tempVar);
				  }
				  String tempVar2 = ConsoleInput.scanfRead(null, 1);
				  if (tempVar2 != null)
				  {
					  c = tempVar2.charAt(0);
				  }
				  n++;
				  if (c != ',')
				  {
					  break;
				  }
	}
	for (i = 1;;i++)
	{
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  b[i] = Integer.parseInt(tempVar3);
				  }
				  String tempVar4 = ConsoleInput.scanfRead(null, 1);
				  if (tempVar4 != null)
				  {
					  c = tempVar4.charAt(0);
				  }
				  if (c != ',')
				  {
					  break;
				  }
	}
	for (i = 1;i <= n;i++)
	{
					  if (a[i] < max1)
					  {
						  max1 = a[i];
					  }
	}
	for (i = 1;i <= n;i++)
	{
					  if (b[i] > max2)
					  {
						  max2 = b[i];
					  }
	}
	for (t = max1;t < max2;t = t + 1)
	{
		  for (i = 1;i <= n;i++)
		  {
				if (a[i] <= t != 0 && b[i]> t)
				{
									d[t]++;
				}
		  }
	}
	for (i = 1;i <= max2 - max1;i++)
	{
					  if (d[i] > max)
					  {
						  max = d[i];
					  }
	}
	System.out.printf("%d %d\n",n,max);

		return 0;
	}

}

