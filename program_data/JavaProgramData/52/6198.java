package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int temp;
		int[] x = new int[100];
		char c;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			temp = x[n - 1];
			for (j = n - 1;j > 0;j--)
			{
				x[j] = x[j - 1];
			}
			x[0] = temp;
		}
		System.out.printf("%d",x[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",x[i]);
		}
		System.out.print('\n');

		return 0;
	}
}

