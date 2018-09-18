public class f
{
	public int a;
	public int b;
	public int c;
}

package <missing>;

public class GlobalMembers
{
	public static f[] st = tangible.Arrays.initializeWithDefaultfInstances(100000);
	public static f tp = new f();
	public static int Main()
	{
		int n;
		int i;
		int ii;
		int j;
		int d;
		int a;
		int b;
		int c;
		char cc;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st[i].a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				st[i].b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				st[i].c = Integer.parseInt(tempVar4);
			}
		st[i].b += st[i].c;
		}
		for (i = 1;i <= 3;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (st[j].b > st[i].b)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tp=st[i];
					tp.copyFrom(st[i]);
					st[i] = st[j];
					st[j] = tp;
				}
			}
		}
		for (i = 1;i <= 3;i++)
		{
		System.out.printf("%d %d\n",st[i].a,st[i].b);
		}
	}


}

