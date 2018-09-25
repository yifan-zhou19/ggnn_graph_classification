package <missing>;

public class GlobalMembers
{
	public static int[] data = new int[9000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			j = Integer.parseInt(tempVar3);
		}
		while ((i != 0) || (j != 0))
		{
			data[i] = -1;
			data[j]++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				i = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				j = Integer.parseInt(tempVar5);
			}
		}
		for (i = 0; i < n; i++)
		{
			if (data[i] == n - 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}
}

