package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] A = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
		}
		int x;
		int y;
		x = y = 0;
		for (i = 1;i <= n;i++)
		{
			if (x <= A[i])
			{
				y = x;
				x = A[i];
			}
		}

		System.out.printf("%d\n",x);
		System.out.printf("%d\n",y);
		return 0;
	}
}

