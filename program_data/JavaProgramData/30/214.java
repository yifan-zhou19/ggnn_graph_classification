package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		y = 0;
		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] % 7 != 0 && (a[i] % 10 != 7 && a[i] / 10 != 7))
			{
				y = y + a[i] * a[i];
			}
		}
			System.out.printf("%d\n",y);
			return 0;
	}

}

