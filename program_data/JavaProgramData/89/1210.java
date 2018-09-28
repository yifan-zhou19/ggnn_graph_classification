package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10002];
		int[] b = new int[10002];
		int[] t = new int[10002];
		int i;
		int j;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (e = 0;;e++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[e] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[e] = Integer.parseInt(tempVar3);
			}
			if (a[e] == 0 && b[e] == 0)
			{
			break;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < e;j++)
			{
				if (a[j] != i && b[j] == i)
				{
				t[i]++;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] == n - 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
			else if (t[i] != n - 1 && i == n - 1)
			{
			System.out.print("NOT FOUND");
			}
		}
	}
}

