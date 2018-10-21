package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int i;
	   int s;
	   do
	   {
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (n == 0 || m == 0)
		   {
			   break;
		   }
		   else if (n == 1)
		   {
			   System.out.print("1");
			   System.out.print("\n");
		   }
		   else
		   {
			   s = 0;
			 for (i = 2; i <= n; i++)
			 {
					s = (s + m) % i;
			 }
				 System.out.printf("%d\n",s + 1);
		   }
	   } while (n != 0 && m != 0);
	   return 0;
	}
}

