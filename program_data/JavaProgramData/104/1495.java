package <missing>;

public class GlobalMembers
{
	public static int X;
	public static int Y;
	public static int TX;
	public static int TY;
	public static int[] A = new int[256];
	public static int[] B = new int[256];
	public static int Main()
	{
		X = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		A[TX = 1] = X;
		B[TY = 1] = Y;
		while (A[TX] > 1)
		{
			A[TX + 1] = A[TX] / 2;
			TX++;
		}
		while (B[TY] > 1)
		{
			B[TY + 1] = B[TY] / 2;
			TY++;
		}
		while ((A[TX] == B[TY]) && (TX > 0) && (TY > 0))
		{
			TX--;
			TY--;
		}
		System.out.print(A[TX + 1]);
		System.out.print("\n");
	}
}

