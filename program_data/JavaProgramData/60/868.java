package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s = 0;
		int t = 0;
		int r = 0;
		int h = 1;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
						  for (j = 2;j < i;j++)
						  {
										   if (i % j != 0)
										   {
											  continue;
										   }
										   else
										   {
												s = s + 1;
												break;
										   }
						  }
						  if (j == i)
						  {
							 a[i] = i;
							 t = t + 1;
						  }
						  if (s == n - 1)
						  {
							 System.out.print("empty");
						  }
		}
		r = t;
		for (i = 2;i <= n;i++)
		{
						  if (a[i + 2] - a[i] == 2)
						  {
											 if (h == 1)
											 {
							 System.out.printf("%d %d",a[i],a[i + 2]);
							 t--;
							 h++;
							 continue;
											 }
							 if (h != 1)
							 {
								  System.out.printf("\n%d %d",a[i],a[i + 2]);
								  t--;
							 }
						  }
		}
		if (t == r)
		{
		   System.out.print("empty");
		}
	return 0;
	}
}

