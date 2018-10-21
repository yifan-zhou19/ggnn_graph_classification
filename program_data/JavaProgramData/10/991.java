package <missing>;

public class GlobalMembers
{
	public static int max(int[] a, int n, int high)
	{
	  int c;
	  int b;
	  if (n == 0)
	  {
			if (a[0] > high)
			{
				return 0;
			}
			else
			{
				return 1;
			}
	  }
	  else
	  {
		   if (a[n] > high)
		   {
			  return max(a, n - 1, high);
		   }
		   else
		   {
				c = max(a, n - 1, a[n]) + 1;
				b = max(a, n - 1, high);
				if (c > b)
				{
					return c;
				}
				else
				{
					return b;
				}
		   }
	  }
	}
	public static int Main()
	{
	  int n;
	  int i;
	  int[] a = new int[25];
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
			 a[n - i - 1] = Integer.parseInt(tempVar2);
		 }
	  }
	  System.out.printf("%d",max(a, n, 32767));
	}
}

