package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n = 0;
		int k = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 if (m % 3 == 0)
	 {
		   System.out.print("3");
		   n++;
	 }
	 if (m % 5 == 0)
	 {
		   if (n != 0)
		   {
			   System.out.print(" ");
		   }
		   System.out.print("5");
		   n++;
		   k++;
	 }
	 if (m % 7 == 0)
	 {
		   if (n != 0 || k != 0)
		   {
			   System.out.print(" ");
		   }
		   System.out.print("7");
		   n++;
	 }
	 if (n == 0)
	 {
	   System.out.print("n");
	 }
	}
}

