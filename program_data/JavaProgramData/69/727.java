package <missing>;

public class GlobalMembers
{
	public static int Max(int X,int Y)
	{
		return X > Y != 0 ? X : Y;
	}
	public static int Main()
	{
		String A = new String(new char[260]);
		String B = new String(new char[260]);
		int[] C = new int[260];
		A = new Scanner(System.in).nextLine();
		B = new Scanner(System.in).nextLine();
		int N = A.length();
		int M = B.length();
		int S = Max(N, M);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(C,0,(Integer.SIZE / Byte.SIZE));
		for (int I = 0; I < N; I++)
		{
			C[I] = A.charAt(N - I - 1) - '0';
		}
		for (int I = 0; I < M; I++)
		{
			C[I] = C[I] + B.charAt(M - I - 1) - '0';
		}
		for (int I = 0; I < S; I++)
		{
			if (C[I] >= 10)
			{
				C[I] = C[I] - 10;
				C[I + 1]++;
			}
		}
		while (C[S] == 0 && S >= 0)
		{
			S--;
		}
		for (int I = S; I >= 0; I--)
		{
			System.out.print(C[I]);
		}
		if (S < 0)
		{
			System.out.print(0);
		}
	}
}
