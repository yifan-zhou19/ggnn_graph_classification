package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int c;
	  for (a = 0;a <= 2;a++)
	  {
	   for (b = 0;b <= 2;b++)
	   {
		  if (a == b)
		  {
		  continue;
		  }
	   }
	  }
		 for (c = 0;c <= 2;c++)
		 {
			if (a == b && b == c)
			{
			 continue;
			}
			else
			{

			 System.out.print("BCA");
			 System.out.print("\n");
			}
			 break;
		 }
	 return 0;
	}
}
