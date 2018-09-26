package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[13];
		int X;
		int B;
		char[][] C = new char[8][10];
		char c1;
		char c2;
		int N;
		int Sum = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		X = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		B = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Sum = ((N - 1) % 7) * 365 + ((N - 1) / 4 - (N - 1) / 100 + (N - 1) / 400);
		int S = B;
		if (N % 100 != 0)
		{
			if (N % 4 == 0)
			{
				A[2] = 29;
			}
			else
			{
				A[2] = 28;
			}
		}
		else if (N % 400 == 0)
		{
			A[2] = 29;
		}
		else
		{
			A[2] = 28;
		}
		A[1] = A[3] = A[5] = A[7] = A[8] = A[10] = A[12] = 31;
		A[4] = A[6] = A[9] = A[11] = 30;
		for (int I = 1; I < X; I++)
		{
			S += A[I];
		}
		Sum = (Sum + S) % 7;
		if (Sum == 1)
		{
			System.out.print("Mon.");
			System.out.print("\n");
		}
		if (Sum == 2)
		{
			System.out.print("Tue.");
			System.out.print("\n");
		}
		if (Sum == 3)
		{
			System.out.print("Wed.");
			System.out.print("\n");
		}
		if (Sum == 4)
		{
			System.out.print("Thu.");
			System.out.print("\n");
		}
		if (Sum == 5)
		{
			System.out.print("Fri.");
			System.out.print("\n");
		}
		if (Sum == 6)
		{
			System.out.print("Sat.");
			System.out.print("\n");
		}
		if (Sum == 0)
		{
			System.out.print("Sun.");
			System.out.print("\n");
		}
	}
}

