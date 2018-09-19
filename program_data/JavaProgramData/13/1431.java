package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int b;
		int d;
		int e;
		int f;
		int g;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",p);
		a[p]++;
		for (i = 2;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		if (a[p] == 0)
		{
			System.out.printf(" %d",p);
			a[p]++;
		}
		}
		return 7;
	}
}

