package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????3?5?7????.cpp   **
	//*?????? 1200012768 **
	//*???2012.10.5  **
	//********************************
	public static int Main() //???
	{
		 int num = 0; //??int??
		 int a = 0;
		 int b = 0;
		 int c = 0;
		 num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 a = num % 3, b = num % 5, c = num % 7; //???3?5?7??
		 if (a == 0 && b == 0 && c == 0) //????3?5?7??
		 {
			 System.out.print(3);
			 System.out.print(" ");
			 System.out.print(5);
			 System.out.print(" ");
			 System.out.print(7);
			 System.out.print("\n");
		 }
		 else if (a == 0 && b == 0 && c != 0) //????3?5??
		 {
			 System.out.print(3);
			 System.out.print(" ");
			 System.out.print(5);
			 System.out.print("\n");
		 }
		 else if (a == 0 && b != 0 && c == 0) //????3?5?7??
		 {
			 System.out.print(3);
			 System.out.print(" ");
			 System.out.print(7);
			 System.out.print("\n");
		 }
		 else if (a == 0 && b != 0 && c != 0) //????3??
		 {
			 System.out.print(3);
			 System.out.print("\n");
		 }
		 else if (a != 0 && b == 0 && c == 0) //????5?7??
		 {
			 System.out.print(5);
			 System.out.print(" ");
			 System.out.print(7);
			 System.out.print("\n");
		 }
		 else if (a != 0 && b == 0 && c != 0) //????5??
		 {
			 System.out.print(5);
			 System.out.print("\n");
		 }
		 else if (a != 0 && b != 0 && c == 0) //????7??
		 {
			 System.out.print(7);
			 System.out.print("\n");
		 }
		 else if (a != 0 && b != 0 && c != 0) //?????3?5?7??
		 {
			 System.out.print("n");
			 System.out.print("\n");
		 }
		 return 0;
	}

}

