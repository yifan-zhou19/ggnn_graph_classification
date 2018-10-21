package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[100];
	   for (int i = 2;i <= 100;i++)
	   {
		   a[i] = 0;
	   }
	   int n;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int b;
	   b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   System.out.print(b);
	   a[b] = 1;
	   for (int i = 2;i <= n;i++)
	   {
		   //int b;
		   b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (a[b] == 0)
		   {
			   a[b] = 1;
			   System.out.print(' ');
			   System.out.print(b);
		   }
	   }
	}
}

