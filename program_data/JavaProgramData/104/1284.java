package <missing>;

public class GlobalMembers
{
	public static int binTree(int a, int b)
	{
		if (a == b)
		{
			return a;
		}
		if (a > b)
		{
			binTree(a / 2, b);
		}
			 else
			 {
			binTree(a, b / 2);
			 }
	}

	public static int Main()
	{
		int n;
		int m;
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
		System.out.printf("%d", binTree(n, m));
	}

}

