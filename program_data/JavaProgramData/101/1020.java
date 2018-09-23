package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int A;
	   int B;
	   int C;
	   int x;
	   int y;
	   int z;
	   for (A = 0;A <= 2;A++)
	   {
		 for (B = 0;B <= 2;B++)
		 {
			for (C = 0;C <= 2;C++)
			{
				x = (A < B) + (A == C);
			 y = (A > B) + (A > C);
			 z = (C > B) + (B > A);
			 if ((x > y && y > z) && (A < B && B < C))
			 {
				System.out.print("A");
				System.out.print("B");
				System.out.print("C");
				System.out.print("\n");
			 }
			 if ((x > z && z > y) && (A < C && C < B))
			 {
				System.out.print("A");
				System.out.print("C");
				System.out.print("B");
				System.out.print("\n");
			 }
			 if ((y > x && x > z) && (B < A && A < C))
			 {
				System.out.print("B");
				System.out.print("A");
				System.out.print("C");
				System.out.print("\n");
			 }
			 if ((y > z && z > x) && (B < C && C < A))
			 {
				System.out.print("B");
				System.out.print("C");
				System.out.print("A");
				System.out.print("\n");
			 }
			 if ((z > x && x > y) && (C < A && A < B))
			 {
				System.out.print("C");
				System.out.print("A");
				System.out.print("B");
				System.out.print("\n");
			 }
			 if ((z > y && y > x) && (C < B && B < A))
			 {
				System.out.print("C");
				System.out.print("B");
				System.out.print("A");
				System.out.print("\n");
			 }
			}
		 }
	   }
	   return 0;
	}
}
