package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[10000];
	  int t = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n < 5)
	  {
		  System.out.print("empty");
	  }
	  else
	  {
		 for (int i = 3;i <= n;i++)
		 {
			 for (int j = 2;j < i;j++)
			 {
			   if (i % j == 0)
			   {
				   break;
			   }
			   else
			   {
				  if (j < i - 1)
				  {
					  continue;
				  }
				  if (j == i - 1)
				  {
					  a[t] = i;
					  t++;
				  }
			   }
			 }
		 }
		 for (int r = 1;r < t;r++)
		 {
			if (a[r] - a[r - 1] == 2)
			{
				System.out.printf("%d %d\n",a[r - 1],a[r]);
			}
		 }
	  }
	  return 0;
	}
}

