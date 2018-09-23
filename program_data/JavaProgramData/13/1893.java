package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int t;
	  int x;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int[] a = new int[n];
	  for (i = 0;i < n;i++)
	  {
		 x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 a[i] = x;
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (j = i + 1;j < n;j++)
		  {
			   if (a[i] == a[j])
			   {
				  for (t = j;t < n;t++)
				  {
					 a[t] = a[t + 1];
				  }
				   n--;
				   j--;
			   }
		  }
	  }
	  for (i = 0;i < n - 1;i++)
	  {
		  System.out.print(a[i]);
		  System.out.print(" ");
	  }
	  System.out.print(a[n - 1]);
	  System.out.print("\n");
	  return 0;
	}
}

