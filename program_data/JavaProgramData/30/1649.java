package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Sum = 0;
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int I = 1; I <= N; I++)
		{
			int K = I;
			int Flag = 0;
			while (K != 0)
			{
				if (K % 10 == 7)
				{
					Flag = 1;
				}
				K = K / 10;
			}
			if (I % 7 == 0)
			{
				Flag = 1;
			}
			if (Flag == 0)
			{
				Sum += I * I;
			}
		}
		System.out.print(Sum);
		System.out.print("\n");
		return 0;
	}

}

