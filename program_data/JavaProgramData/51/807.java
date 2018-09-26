package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String c = new String(new char[505]);
		  int[] a = new int[505];
		  int i;
		  int j;
		  int k;
		  int n;
		  int m;
		  int max;
		  int fu;
		  int ji;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  c = tempVar2.charAt(0);
		  }
		  m = c.length() - 1;
		  for (i = 0;i <= m - n;i++)
		  {
			   a[i] = 1;
			   for (j = i + 1;j <= m - n + 1;j++)
			   {
					  for (k = 0;k <= n - 1;k++)
					  {
						   if (c.charAt(i + k) != c.charAt(j + k))
						   {
						   break;
						   }
					  }
					  if (k == n)
					  {
					  a[i]++;
					  }
			   }
		  }
		  for (max = 1,i = 0;i <= m - n;i++)
		  {
			   if (a[i] > max)
			   {
			   max = a[i];
			   }
		  }
		  if (max == 1)
		  {
			  System.out.print("NO\n");
		  }
		  else
		  {
			 System.out.printf("%d\n",max);
			 for (i = 0;i <= m - n;i++)
			 {
			   if (a[i] == max)
			   {
				for (k = 0;k <= n - 1;k++)
				{
				System.out.printf("%c",c.charAt(i + k));
				}
				System.out.print("\n");
			   }
			 }
		  }
	}

}

