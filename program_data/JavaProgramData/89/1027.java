package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[10000];
		int cele;
		int i;
		int j;
		int k;
		int f = 0;
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
		while (i != 0 || j != 0)
		{
			a[i] = -1;
			a[j]++;
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
		for (k = 0;k < n;k++)
		{
			if (a[k] == n - 1)
			{
			System.out.printf("%d",k);
			f = 1;
			}
		}
		if (f == 0)
		{
			System.out.print("NOT FOUND");
		}
	}

}

