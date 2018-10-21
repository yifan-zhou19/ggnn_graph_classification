package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int i;
		int n;
		int c = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			c++;
		}
		int[] b = new int[101];
		b[1] = 1;
		b[2] = 1;
		for (i = 3;i <= 100;i++)
		{
			b[i] = b[i - 1] + b[i - 2];

		}
		for (i = 1;i <= c;i++)
		{
			System.out.printf("%d\n",b[a[i]]);
		}
	}

}

