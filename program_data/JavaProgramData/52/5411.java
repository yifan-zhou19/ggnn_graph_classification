package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] t = new int[105];
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *tt[105];
		int[] tt = new int[105]; //????>_<
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t[i] = Integer.parseInt(tempVar3);
			}
			tt[i] = t[i]; //???
		}
		for (int i = 1;i <= m;i++)
		{
			int p = tt[n];
			for (int j = n;j >= 2;j--)
			{
				tt[j] = tt[j - 1]; //??????= =
			}
			tt[1] = p;
		}
		System.out.printf("%d",t[1]);
		for (int i = 2;i <= n;i++)
		{
			System.out.printf(" %d",t[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

