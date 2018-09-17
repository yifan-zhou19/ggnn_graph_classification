package <missing>;

public class GlobalMembers
{
	public static int Main()
	{ // A B C????????0?1?2?a b c???????????1?2?3
		 for (int a = 1; a <= 3; a++)
		 {
			 for (int b = 1; b <= 3; b++)
			 {
				 for (int c = 1; c <= 3; c++) // ?????????1?2?3?a,b,c???
				 {
					 if (((b > a) + (a == c) + a == 3) && ((b < a) + (a > c) + b == 3) && ((c > b) + (b > a) + c == 3)) // ???????????????????????3
					 {
						 if (a > b && b > c)
						 {
							System.out.print("C");
							System.out.print("B");
							System.out.print("A");
							System.out.print("\n");
						 }
						 else if (a > c && c > b)
						 {
							  System.out.print("B");
							  System.out.print("C");
							  System.out.print("A");
							  System.out.print("\n");
						 }
						 else if (b > a && a > c)
						 {
							  System.out.print("C");
							  System.out.print("A");
							  System.out.print("B");
							  System.out.print("\n");
						 }
						 else if (b > c && c > a)
						 {
							  System.out.print("A");
							  System.out.print("C");
							  System.out.print("B");
							  System.out.print("\n");
						 }
						 else if (c > a && a > b)
						 {
							  System.out.print("B");
							  System.out.print("A");
							  System.out.print("C");
							  System.out.print("\n");
						 }
						 else if (c > b && b > a)
						 {
							  System.out.print("A");
							  System.out.print("B");
							  System.out.print("C");
							  System.out.print("\n");
						 }
					 }
				 }
			 }
		 }
		 return 0;
	}

}
