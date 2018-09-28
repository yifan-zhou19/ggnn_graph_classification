package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int res = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
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
			c[i] = a[i] - b[i];
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == -1 || c[i] == 2)
			{
				res++;
			}
			if (c[i] == 0)
			{
				res += 0;
			}
			if (c[i] == 1 || c[i] == -2)
			{
				res--;
			}
		}
		if (res > 0)
		{
			System.out.print("A\n");
		}
		if (res < 0)
		{
			System.out.print("B\n");
		}
		if (res == 0)
		{
			System.out.print("Tie\n");
		}
		return 0;
	}
}

