package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[200];
		int n;
		int i;
		int a1 = 0;
		int b1 = 0;
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
			if (a[i] == b[i])
			{
				continue;
			}
			if (a[i] == 0)
			{
			if (b[i] == 1)
			{
				a1++;
			}
			if (b[i] == 2)
			{
				b1++;
			}
			}
			if (a[i] == 1)
			{
			if (b[i] == 2)
			{
				a1++;
			}
			if (b[i] == 0)
			{
				b1++;
			}
			}
			if (a[i] == 2)
			{
			if (b[i] == 0)
			{
				a1++;
			}
			if (b[i] == 1)
			{
				b1++;
			}
			}
		}
		if (a1 == b1)
		{
			System.out.print("Tie");
		}
		if (a1 > b1)
		{
			System.out.print("A");
		}
		if (a1 < b1)
		{
			System.out.print("B");
		}
	return 0;
	}
}

