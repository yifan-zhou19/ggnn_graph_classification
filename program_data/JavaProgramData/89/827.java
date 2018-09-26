package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] c = new int[100000];
		int[] d = new int[100000];
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[0] = Integer.parseInt(tempVar3);
		}
		i = 0;
		while (a[i] != 0 || b[i] != 0)
		{
			i++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b[i] = Integer.parseInt(tempVar5);
			}
		}
		for (j = 0;j < i;j++)
		{
			c[a[j]]++;
		}
		for (j = 0;j < i;j++)
		{
			d[b[j]]++;
		}
		for (j = 0;j < n;j++)
		{
			if (c[j] == 0 && d[j] >= n - 1)
			{
				System.out.printf("%d",j);
				t = 1;
			}
		}
		if (t == 0)
		{
		System.out.print("NOT FOUND");
		}
	}

}

