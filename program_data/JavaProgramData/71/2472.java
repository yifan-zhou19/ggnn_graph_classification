package <missing>;

public class GlobalMembers
{
	public static int dijitian(int Y, int M, int D)
	{
		int run = int Y;
		int i;
		int result = 0;
		for (i = 1;i < M;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				result += 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 30;
			}
			if (i == 2)
			{
				if (run(Y) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result = result + D;
		return result;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] Y = new int[200];
		int[] M = new int[200];
		int[] m = new int[200];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				Y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				M[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((dijitian(Y[i], M[i], 1) - dijitian(Y[i], m[i], 1)) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}

		}

		return 0;
	}
	public static int run(int Y)
	{
		int Q;
		if (Y % 400 == 0 || (Y % 4 == 0 && Y % 100 != 0))
		{
			Q = 1;
		}
		else
		{
			Q = 0;
		}
	return Q;
	}

}

