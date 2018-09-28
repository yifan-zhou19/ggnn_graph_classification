package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static fen(int n,int k)
	{
		int m;
		int i;
		int t;
		for (m = 1;;m++)
		{
			for (i = 0,t = m;i < n;i++)
			{
				if (t % n == k)
				{
					t -= t / n + k;
				}
				else
				{
					break;
				}
			}
			if (i >= n != 0 && t >= 1)
			{
				break;
			}
		}
		return m;
	}

	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",fen(n,k));
	}
}

