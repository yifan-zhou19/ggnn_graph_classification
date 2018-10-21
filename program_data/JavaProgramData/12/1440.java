package <missing>;

public class GlobalMembers
{
	//*?????**
	//*????? 1300012893 **
	//*???2013.10.31**
	   public static int Main()
	   {
		  int x;
		  int j;
		  int[] a = new int[16];
		  x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  int i = 1;
		  int k = 0;
		  while (x != -1)
		  {
			a[i] = x;
			i++;
		   if (x != 0)
		   {
			   k = i;
		   }
			 else
			 {
				int sum = 0;
			 for (i = 1;i <= k;i++)
			 {
				  for (j = 1;j <= k ;j++)
				  {
				   if (a[i] == 2 * a[j])
				   {
					  sum++;
				   }
				  }
			 }
					System.out.print((sum - 1));
					System.out.print("\n");
					i = 1;
			 }
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
			return 0;
	   }
}

