package <missing>;

public class GlobalMembers
{
	public static int Mi(int n)
	{
		int i;
		int ans = 1;
		for (i = 0;i < n;i++)
		{
			ans = ans * 2;
		}
		return ans;
	}
	public static int divide(int x)
	{
		return x / 2;
	}
	public static int Main()
	{
		  int x;
		  int y;
		  int n;
		  int i;
		  int m;
		  int j;
		  int c = 0;
		  int[] a = new int[11];
		  int[] b = new int[11];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  y = Integer.parseInt(tempVar2);
		  }
		  for (n = 0;;n++)
		  {
			  if (x >= Mi(n) != 0 && x < Mi(n + 1))
			  {
				   if (n > 0)
				   {
					 a[n] = x;
					 for (i = n - 1;i >= 0;i--)
					 {
					   a[i] = divide(a[i + 1]);
					 }
				   }
				   else
				   {
					   a[n] = x;
				   }
				   break;
			  }
		  }
		  for (m = 0;;m++)
		  {
			  if (y >= Mi(m) != 0 && y < Mi(m + 1))
			  {
				   if (m > 0)
				   {
					 b[m] = y;
					 for (i = m - 1;i >= 0;i--)
					 {
					   b[i] = divide(b[i + 1]);
					 }
				   }
				   else
				   {
					   b[m] = y;
				   }
				   break;
			  }
		  }
		  for (i = n;i >= 0;i--)
		  {
			  for (j = m;j >= 0;j--)
			  {
				  if (a[i] == b[j])
				  {
					   System.out.printf("%d\n",a[i]);
					   c = c + 1;
					   break;
				  }
			  }
			  if (c == 1)
			  {
				  break;
			  }
		  }
	}
}

