package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int Y;
		int M1;
		int M2;
	for (int i = 0;i < N;i++)
	{
		Y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		M1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		M2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {0, 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		if (Y % 400 == 0 || (Y % 100 != 0 && Y % 4 == 0))
		{
			a[2]++;
		}
		int S = 0;
		for (int i = M1;i < M2;i++)
		{
			S += a[i];
		}
		for (int i = M2;i < M1;i++)
		{
			S += a[i];
		}
		if (S % 7 == 0)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
	}
		return 0;
	}
}

