package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[] a = new int[100000];
	   for (int i = 0;i < n;i++) //???????
	   {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int t = 0;
	   for (int i = 0;i < n - t;)
	   {
		  if (a[i] == k)
		  {
			  for (int j = i;j < n - t;j++)
			  {
				  a[j] = a[j + 1];
			  }
			  t++;
		  }
		  else
		  {
			  i++;
		  }
	   }
	   for (int i = 0;i < n - t - 1;i++)
	   {
		   System.out.print(a[i]);
		   System.out.print(" ");
	   }
	   System.out.print(a[n - t - 1]);
	   return 0;
	}
}

