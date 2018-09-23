package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					a = (B > A) + (C == A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					if (a == 2 && b == 1 && c == 0 && C > B && B > A)
					{
						System.out.print("A");
						System.out.print("B");
						System.out.print("C");
						System.out.print("\n");
					}
					if (a == 2 && b == 0 && c == 1 && B > C && C > A)
					{
						System.out.print("A");
						System.out.print("C");
						System.out.print("B");
						System.out.print("\n");
					}
					if (a == 1 && b == 2 && c == 0 && C > A && A > B)
					{
						System.out.print("B");
						System.out.print("A");
						System.out.print("C");
						System.out.print("\n");
					}
					if (a == 1 && b == 0 && c == 2 && B > A && A > C)
					{
						System.out.print("C");
						System.out.print("A");
						System.out.print("B");
						System.out.print("\n");
					}
					if (a == 0 && b == 1 && c == 2 && A > B && B > C)
					{
						System.out.print("C");
						System.out.print("B");
						System.out.print("A");
						System.out.print("\n");
					}
					if (a == 0 && b == 2 && c == 1 && A > C && C > B)
					{
						System.out.print("B");
						System.out.print("C");
						System.out.print("A");
						System.out.print("\n");
					}
				}
			}
		}
				return 0;

	}
}
