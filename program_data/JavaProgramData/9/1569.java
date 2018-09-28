public class Inf
{
	public String c = new String(new char[10]);
	public int a;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int o = 0;
		int y = 0;
		int t;
		int i;
		int j;
		String temp = new String(new char[10]);
		Inf[] inf = tangible.Arrays.initializeWithDefaultInfInstances(100);
		Inf[] old = tangible.Arrays.initializeWithDefaultInfInstances(100);
		Inf[] young = tangible.Arrays.initializeWithDefaultInfInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				inf[i].c = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				inf[i].a = Integer.parseInt(tempVar3);
			}
			if (inf[i].a >= 60)
			{
				old[o].c = inf[i].c;
				old[o].a = inf[i].a;
				o++;
			}
			else
			{
				young[y].c = inf[i].c;
				young[y].a = inf[i].a;
				y++;
			}
		}
		for (j = 1;j < o;j++)
		{
			for (i = 0;i < o - j;i++)
			{
				if (old[i].a < old[i + 1].a)
				{
					temp = old[i].c;
					old[i].c = old[i + 1].c;
					old[i + 1].c = temp;
					t = old[i].a;
					old[i].a = old[i + 1].a;
					old[i + 1].a = t;
				}
			}
		}
		for (i = 0;i < o;i++)
		{
			System.out.printf("%s\n",old[i].c);
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf("%s\n",young[i].c);
		}
		return 0;
	}
}

