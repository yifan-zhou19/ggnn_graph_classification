package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zs;
	 zs = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 if (zs % 105 == 0)
	 {
		 System.out.print("3");
		 System.out.print(" ");
		 System.out.print("5");
		 System.out.print(" ");
		 System.out.print("7");
		 System.out.print("\n");
	 }
	 else if (zs % 35 == 0 && zs % 3 != 0)
	 {
		 System.out.print("5");
		 System.out.print(" ");
		 System.out.print("7");
		 System.out.print("\n");
	 }
	 else if (zs % 21 == 0 && zs % 5 != 0)
	 {
		 System.out.print("3");
		 System.out.print(" ");
		 System.out.print("7");
		 System.out.print("\n");
	 }
	 else if (zs % 15 == 0 && zs % 7 != 0)
	 {
		 System.out.print("3");
		 System.out.print(" ");
		 System.out.print("5");
		 System.out.print("\n");
	 }
	 else if (zs % 7 == 0 && zs % 5 != 0 && zs % 3 != 0)
	 {
		 System.out.print("7");
		 System.out.print("\n");
	 }
	 else if (zs % 7 != 0 && zs % 5 == 0 && zs % 3 != 0)
	 {
		 System.out.print("5");
		 System.out.print("\n");
	 }
	 else if (zs % 7 != 0 && zs % 5 != 0 && zs % 3 == 0)
	 {
		 System.out.print("3");
		 System.out.print("\n");
	 }
	 else if (zs % 7 != 0 && zs % 5 != 0 && zs % 3 != 0)
	 {
		 System.out.print("n");
		 System.out.print("\n");
	 }
	 return 0;
	}
}

