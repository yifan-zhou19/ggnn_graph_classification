package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int know;
		int a;
		int b;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p = new int[n];
		int[] q = new int[n];
		for (int i = 0;i < n;i++)
		{
			q[i] = 0;
			p[i] = 0;
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
				break;
			}
			q[b] = q[b] + 1;
			p[a] = 1;
		}
		for (int i = 0;i < n;i++)
		{
			if (p[i] == 0 && q[i] == n - 1)
			{
				System.out.printf("%d",i);
				c = 1;
			}
		}
			if (c == 0)
			{
		System.out.print("NOT FOUND");
			}
		return 0;
	}


}

