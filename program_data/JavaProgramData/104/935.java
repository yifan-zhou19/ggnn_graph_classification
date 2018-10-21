package <missing>;

public class GlobalMembers
{
	public static void father(int x,int y)
	{
		 int r1 = 0;
		 int r2 = 0;
		 for (int i = 1;i < 12;i++)
		 {
			   if (x - Math.pow(2,i - 1) < Math.pow(2,i - 1) && x - Math.pow(2,i - 1) >= 0)
			   {
			   r1 = i;
			   }
			   if ((y - Math.pow(2,i - 1)) < Math.pow(2,i - 1) && (y - Math.pow(2,i - 1)) >= 0)
			   {
			   r2 = i;
			   }
			   if (r1 != 0 && r2 != 0)
			   {
				   break;
			   }
		 }
		  if (r1 > r2)
		  {
				x = x / Math.pow(2,r1 - r2);
		  }
		  else if (r1 < r2)
		  {
				y = y / Math.pow(2,(r2 - r1));
		  }
		  if (x == y)
		  {
				 System.out.print(x);
				 System.out.print("\n");
		  }
		  else
		  {
				father(x / 2, y / 2);
		  }
	}
	public static int Main()
	{
		 int m;
		 int n;
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 father(m, n);
		 return 0;
	}

}

