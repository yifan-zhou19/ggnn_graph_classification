package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		for (a = 1; a <= 3; a++) //A???
		{
			  for (b = 1; b <= 3; b++) //B???
			  {
					for (c = 1; c <= 3; c++) //C???
					{
						  if (a != b || a != c || b != c)
						  {
							   A = (b > a) + (c == a); //ABC????
							   B = (a > b) + (a > c);
							   C = (c > b) + (b > a);
							   if (A == 2 && a == 1 && B == 1 && b == 2 && C == 0 && c == 3)
							   {
									  System.out.print("A");
									  System.out.print("B");
									  System.out.print("C");
									  System.out.print("\n");
							   }
							   if (A == 2 && a == 1 && B == 0 && b == 3 && C == 1 && c == 2)
							   {
									  System.out.print("A");
									  System.out.print("C");
									  System.out.print("B");
									  System.out.print("\n");
							   }
							   if (A == 1 && a == 2 && B == 0 && b == 3 && C == 2 && c == 1)
							   {
									  System.out.print("C");
									  System.out.print("A");
									  System.out.print("B");
									  System.out.print("\n");
							   }
							   if (A == 1 && a == 2 && B == 2 && b == 1 && C == 0 && c == 3)
							   {
									  System.out.print("B");
									  System.out.print("A");
									  System.out.print("C");
									  System.out.print("\n");
							   }
							   if (A == 0 && a == 3 && B == 1 && b == 2 && C == 2 && c == 1)
							   {
									  System.out.print("C");
									  System.out.print("B");
									  System.out.print("A");
									  System.out.print("\n");
							   }
							   if (A == 0 && a == 3 && B == 2 && b == 1 && C == 1 && c == 2)
							   {
									  System.out.print("B");
									  System.out.print("C");
									  System.out.print("A");
									  System.out.print("\n");
							   }
						  }
					}
			  }
		}
		return 0;
	}
}
