package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int m = 0;
		int s = 0;
		int t;
		int i = 0;
		int[] c = new int[10000];
		int[] d = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
			c[a] = 0;
			d[a] = 0;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		while (a != 0 || b != 0)
		{
			c[a]++;
			d[b]++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b = Integer.parseInt(tempVar5);
			}
		}
		for (s = 0;s < n;s++)
		{
			if (c[s] == 0 && d[s] == n - 1)
			{
				System.out.printf("%d",s);
				i = 1;
				break;
			}
		}
		if (i == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

