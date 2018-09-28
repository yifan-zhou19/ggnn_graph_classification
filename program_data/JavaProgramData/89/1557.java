package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
		int[] d = new int[10000];
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 10000;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
			c[a[i]]++;
			d[b[i]]++;
		}
		for (i = 0;i < n;i++)
		{
		if (d[b[i]] == n - 1 && c[b[i]] == 0)
		{
		System.out.printf("%d",b[i]);
		break;
		}
		}
		if (i == n)
		{
		System.out.print("NOT FOUND");
		}
	}
}

