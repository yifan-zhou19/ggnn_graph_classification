package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int A;
		int S;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		S = 0;
		for (i = 1;i <= n;i++)
		{
			if ((i % 7 != 0) && (i % 10 != 7) && (i != 71) && (i != 72) && (i != 73) && (i != 74) && (i != 75) && (i != 76) && (i != 78) && (i != 79))
			{
				A = i * i, S = S + A;
			}
			else
			{
				A = 0, S = S + A;
			}
		}
		System.out.printf("%d", S);
		return 0;
	}

}

