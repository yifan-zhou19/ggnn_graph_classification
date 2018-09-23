package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[10000];
		int i;
		int j;
		int[] x = new int[10000];
		int z = 0;
		int h = 1;
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
				x[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		m[0] = x[0];
		for (i = 2;i <= n;i++)
		{
			   z = 0;
			for (j = 1;j <= i - 1;j++)
			{
			   if (x[j - 1] == x[i - 1])
			   {
				   z = 1;
			   }
			}
			if (z == 0)
			{
				m[h] = x[i - 1];
						 h = h + 1;
			}
		}
		for (i = 0;i <= h - 1;i++)
		{
			System.out.printf("%d",m[i]);
		if (i != h - 1)
		{
			System.out.print(" ");
		}
		}

		return 0;

	}

}

