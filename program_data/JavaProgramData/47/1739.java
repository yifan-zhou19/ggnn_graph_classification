package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] p = a;
		int n;
		int i;
		int t;
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
				p + i = tempVar2;
			}
		}
		if (n == 1)
		{
			System.out.printf("%d",p[0]);
		}
		else
		{
		for (i = 0;i <= (n - 1) / 2;i++)
		{
			t = p[i];
			p[i] = (p + n - 1 - i);
			p[n - 1 - i] = t;
		}
		System.out.printf("%d",p[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",p[i]);
		}
		}
		System.out.print("\n");
		return 0;
	}


}

