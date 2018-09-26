package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
		   if (i == 0 && j == 0)
		   {
			   break;
		   }
		   a[i]++;
		   b[j]++;
		}
	   for (i = 0; i < n; i++)
	   {
		  if (a[i] == 0 && b[i] == n - 1)
		  {
			  System.out.print(i);
			  System.out.print("\n");
			  break;
		  }
	   }
	  if (i == n)
	  {
		  System.out.print("NOT FOUND");
		  System.out.print("\n");
	  }
		return 0;
	}
}

