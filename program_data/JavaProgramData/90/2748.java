package <missing>;

public class GlobalMembers
{
	public static int solve(int panzi,int pingguo)
	{
		if (panzi == 1)
		{
			return 1;
		}
		else
		{
			if (panzi <= pingguo)
			{
				return solve(panzi - 1, pingguo) + solve(panzi, pingguo - panzi);
			}
			else
			{
				return solve(panzi - 1, pingguo);
			}
		}
	}
	public static int Main()
	{
		int t;
		int M;
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",solve(N, M));
		}

	}
}

