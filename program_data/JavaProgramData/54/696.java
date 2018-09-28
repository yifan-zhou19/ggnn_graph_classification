package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   int k;
	   int x;
	   int flag;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (m = 1;;m++)
	   {
		   x = m;
		   flag = 1;
		   for (int i = 0;i < n;i++)
		   {
			   if ((x - k) % n != 0 || x < n + k)
			   {
				   flag = 0;
				   break;
			   }
			   else
			   {
				   x = (x - k) * (n - 1) / n;
			   }
		   }
		   if (flag != 0)
		   {
			   System.out.print(m);
			   System.out.print("\n");
			   break;
		   }
	   }
	   return 0;
	}
}

