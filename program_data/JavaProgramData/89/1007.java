package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int[] b = new int[20000];
		int[] count = new int[10000];
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = Integer.parseInt(tempVar3);
		}
		while (a[i] != 0 || b[i] != 0)
		{
			count[a[i]] = 1;
			count[b[i]]--;
			i++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[i] = Integer.parseInt(tempVar5);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (count[i] == (-n + 1))
			{
				System.out.printf("%d\n",i);
				return 0;
			}
		}
		System.out.print("NOT FOUND\n");
		return 0;
	}

}

