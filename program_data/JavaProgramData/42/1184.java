package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[] a = new int[100000];
	 for (i = 0;i < n;i++)
	 {
	   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 int k;
	 int j = 0;
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n - j;)
	 {
		  if (a[i] == k)
		  {
			for (int t = i;t < n - j - 1;t++)
			{
		   a[t] = a[t + 1];
			}
		 j++;
		  }
	   else
	   {
		i++;
	   }
	 }
	 for (i = 0;i < n - j - 1;i++)
	 {
	   System.out.print(a[i]);
	   System.out.print(" ");
	 }
	 System.out.print(a[n - j - 1]);
	 System.out.print("\n");
	 return 0;
	}

}

