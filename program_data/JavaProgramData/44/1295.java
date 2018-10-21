package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int e;
		int k;
		int m;
		for (k = 1;k < 7;k++)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   x = Integer.parseInt(tempVar);
		   }
		   if (x == 0)
		   {
			   System.out.print("0\n");
		   }
		   if (x < 0)
		   {
			   System.out.print("-");
			   x = -x;
		   }
		   if (x != 0)
		   {
				 for (i = 1;;i++)
				 {
				   if (x % 10 == 0)
				   {
					x /= 10;
				   }
				   else
				   {
					   break;
				   }
				 }
				 for (i = 1;;i++)
				 {
				   e = x % 10;
				   System.out.printf("%d",e);
				   x = x / 10;
				   if (x == 0)
				   {
					   break;
				   }
				 }
				 System.out.print("\n");
		   }
		}
		return 0;
	}
}

