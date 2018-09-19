package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[101];
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
	}
		if (a[b] == 1)
		{
			a[b] = 1;
		}
		else
		{
			if (i != 0)
			{
			System.out.print(" ");
			}
		System.out.printf("%d",b);
		a[b] = 1;
		}
		}
		return 0;
	}

}

