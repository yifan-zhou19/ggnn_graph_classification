public class person
{
	public int kn;
	public int bkn;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		person[] p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = tangible.Arrays.initializeWithDefaultpersonInstances(n);
		for (i = 0;i < n;i++)
		{
			p[i].kn = 0;
			p[i].bkn = 0;
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
				break;
			}
			p[a].kn++;
			p[b].bkn++;
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].kn == 0 && p[i].bkn == n - 1)
			{
				System.out.printf("%d\n",i);
			}
		}
		p = null;
	}
}

