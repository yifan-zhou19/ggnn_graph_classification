package <missing>;

public class GlobalMembers
{
	public static int awin = 0;
	public static int bwin = 0;

	public static void fuck(int a, int b)
	{
		if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
		{
			awin++;
		}
		else if ((a == 1 && b == 0) || (a == 2 && b == 1) || (a == 0 && b == 2))
		{
			bwin++;
		}
	}

	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			fuck(a[i], b[i]);
		}
		if (awin > bwin)
		{
			System.out.print("A\n");
		}
		else if (awin < bwin)
		{
			System.out.print("B\n");
		}
		else
		{
			System.out.print("Tie\n");
		}
		return 0;
	}
}

