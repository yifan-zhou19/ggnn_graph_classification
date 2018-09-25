package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int a;
		int b;
		int f = -1;
		int[] c = new int[10000];
		int[] d = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			c[i] = -1;
			d[i] = 0;
		}
		for (;;)
		{
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
			if (a == 0 && b == 0)
			{
				break;
			}
			else
			{
				c[a] = 0;
				d[b]++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == 0)
			{
				continue;
			}
			if (d[i] == n - 1)
			{
				System.out.printf("%d",i);
				f = i;
			}
		}
		if (f == -1)
		{
			System.out.print("NOT FOUND");
		}
	}

}

