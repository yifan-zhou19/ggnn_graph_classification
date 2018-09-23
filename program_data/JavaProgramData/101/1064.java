package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		for (A = 0;A <= 2;A++)
		{
		for (B = 0;B <= 2;B++)
		{
		for (C = 0;C <= 2;C++)
		{
		if (((B > A) + (A == C) == (2 - A)) && ((A > B) + (A > C) == (2 - B)) && ((C > B) + (B > A) == (2 - C)) && (A != B) && (A != C) && (B != C))
		{
			if (A > B > C)
			{
		System.out.print("C");
		System.out.print("B");
		System.out.print("A");
		System.out.print("\n");
			}
		if (A > C > B)
		{
		System.out.print("B");
		System.out.print("C");
		System.out.print("A");
		System.out.print("\n");
		}
		if (B > A > C)
		{
		System.out.print("C");
		System.out.print("A");
		System.out.print("B");
		System.out.print("\n");
		}
		if (B > C > A)
		{
		System.out.print("A");
		System.out.print("C");
		System.out.print("B");
		System.out.print("\n");
		}
		if (C > B > A)
		{
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.print("\n");
		}
		if (C > A > B)
		{
		System.out.print("B");
		System.out.print("A");
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
