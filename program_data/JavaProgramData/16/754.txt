package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		if (N == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			while (N != 0)
			{
			System.out.print(N % 10);
			N /= 10;
			}
		}
		return 0;
	}

}

