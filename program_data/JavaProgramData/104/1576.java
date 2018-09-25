package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int c;
		int[] mark = new int[1010];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		while (m > 0)
		{
			mark[m] = 1;
			m /= 2;
		}
		while (n > 0)
		{
			if (mark[n] != 0)
			{
				System.out.printf("%d\n",n);
				break;
			}
			n /= 2;
		}
	}
}

