package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 0;
		int B = 0;
		int C = 0;
		int a1;
		int a2;
		int b1;
		int b2;
		int c1;
		int c2;
		for (A = 1 ; A <= 3 ; A++)
		{
			for (B = 1 ; B <= 3 ; B++)
			{
				for (C = 1 ; C <= 3 ; C++)
				{
					a1 = (B > A);
					a2 = (C == A);
					b1 = (A > B);
					b2 = (A > C);
					c1 = (C > B);
					c2 = (B > A);
					if (((A + a1 + a2) == (B + b1 + b2)) && ((B + b1 + b2) == (C + c1 + c2)))
					{
						if ((A < B) && (B < C))
						{
							System.out.print("A");
							System.out.print("B");
							System.out.print("C");
							System.out.print("\n");
						}
						if ((A < C) && (C < B))
						{
							System.out.print("A");
							System.out.print("C");
							System.out.print("B");
							System.out.print("\n");
						}
						if ((B < A) && (A < C))
						{
							System.out.print("B");
							System.out.print("A");
							System.out.print("C");
							System.out.print("\n");
						}
						if ((B < C) && (C < A))
						{
							System.out.print("B");
							System.out.print("C");
							System.out.print("A");
							System.out.print("\n");
						}
						if ((C < A) && (A < B))
						{
							System.out.print("C");
							System.out.print("A");
							System.out.print("B");
							System.out.print("\n");
						}
						if ((C < B) && (B < A))
						{
							System.out.print("C");
							System.out.print("B");
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
