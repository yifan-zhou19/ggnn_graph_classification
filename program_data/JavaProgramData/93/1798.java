package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int a;
		 int b = 0;
		 int c = 0;
		 int r = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 if (a % 3 == 0)
		 {
			 b = 3;
		 }
		 if (a % 5 == 0)
		 {
			 c = 5;
		 }
		 if (a % 7 == 0)
		 {
			 r = 7;
		 }
		 if (b > 0)
		 {
			 System.out.print("3");
		 }
		 if (c > 0 && b > 0)
		 {
			 System.out.print(" 5");
		 }
		   else if (c > 0)
		   {
			   System.out.print("5");
		   }
		 if (r > 0 && (c > 0 || b > 0))
		 {
			 System.out.print(" 7");
		 }
			else if (r > 0)
			{
				System.out.print("7");
			}
		 if (b == 0 && c == 0 && r == 0)
		 {
			 System.out.print("n");
		 }
	}




}

