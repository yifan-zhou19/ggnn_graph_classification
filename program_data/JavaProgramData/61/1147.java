package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int d;
		int k;
		int a;
		int[] b = new int[21];
		int[] c = new int[21];
		b[1] = 1;
		b[2] = 1;
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
				c[i] = Integer.parseInt(tempVar2);
			}
		}
			for (i = 1;i <= n;i++)
			{
				 d = c[i];
					for (k = 3;k <= d;k++)
					{
				b[k] = b[k - 2] + b[k - 1];
					}
				   System.out.printf("%d\n",b[d]);
			}
	}
}

