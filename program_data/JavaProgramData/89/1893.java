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
		int[] p = new int[n];
		for (int i = 0;i < n;i++)
		{
			p[i] = 1;
		}
		int[] q = new int[n];
		for (int i = 0;i < n;i++)
		{
			q[i] = -1;
		}
		int m;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q[m] = Integer.parseInt(tempVar3);
		}
		while (q[m] != 0 || m != 0)
		{
			p[m] = 0;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				q[m] = Integer.parseInt(tempVar5);
			}
		}
		int judge = 0;
		for (int i = 0;i < n;i++)
		{
			if (p[i] == 1)
			{
				System.out.printf("%d",i);
				judge = 1;
			}
		}
		if (judge == 0)
		{
			System.out.print("NOT FOUND");
		}

	}
}

