package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i - 1] = Integer.parseInt(tempVar3);
			}
		}
		int c = 0;
		int d = 0;
		for (int i = 1;i <= n;i++)
		{
			if ((a[i - 1] == 0 && b[i - 1] == 1) || (a[i - 1] == 1 && b[i - 1] == 2) || (a[i - 1] == 2 && b[i - 1] == 0))
			{
				c++;
			}
			if ((b[i - 1] == 0 && a[i - 1] == 1) || (b[i - 1] == 1 && a[i - 1] == 2) || (b[i - 1] == 2 && a[i - 1] == 0))
			{
				d++;
			}
		}
		if (c > d)
		{
			System.out.print("A");
		}
		if (c < d)
		{
			System.out.print("B");
		}
		if (c == d)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

