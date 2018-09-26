package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 if (a % 105 == 0)
	 {
		 System.out.print("3 5 7\n");
	 }
	 else if (a % 15 == 0 && a % 7 != 0)
	 {
		 System.out.print("3 5\n");
	 }
	 else if (a % 21 == 0 && a % 5 != 0)
	 {
		 System.out.print("3 7\n");
	 }
	 else if (a % 35 == 0 && a % 3 != 0)
	 {
		 System.out.print("5 7\n");
	 }
	 else if (a % 35 != 0 && a % 3 == 0)
	 {
		 System.out.print("3\n");
	 }
	 else if (a % 21 != 0 && a % 5 == 0)
	 {
		 System.out.print("5\n");
	 }
	 else if (a % 15 != 0 && a % 7 == 0)
	 {
		 System.out.print("7\n");
	 }
	 else
	 {
		 System.out.print("n\n");
	 }
	}

}

