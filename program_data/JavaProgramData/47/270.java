package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n = 0;
	   int i = 0;
	   int[] a = new int[101];
	   for (i = 1;i <= 100;i++)
	   {
		  a[i] = 0;
	   }
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= n;i++)
	   {
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (i = n;i > 1;i--)
	   {
		  System.out.print(a[i]);
		  System.out.print(" ");
	   }
	   System.out.print(a[1]);
	   return 0;
	}

}

