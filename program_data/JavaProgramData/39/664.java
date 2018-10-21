public class Aw
{
	public String na = new String(new char[20]);
	public int ft;
	public int ct;
	public int tn;
	public int sum;
	public char po;
	public char ho;
}

package <missing>;

public class GlobalMembers
{
	public static Aw[] st;
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int m;
		int sum = 0;
		char a;
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		Aw[] st = tangible.Arrays.initializeWithDefaultAwInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st[i].na = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				st[i].ft = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				st[i].ct = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				st[i].po = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(null, 1);
			if (tempVar7 != null)
			{
				b = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(null, 1);
			if (tempVar8 != null)
			{
				st[i].ho = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				st[i].tn = Integer.parseInt(tempVar9);
			}
			st[i].sum = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (st[i].ft > 80 && st[i].tn > 0)
			{
				st[i].sum += 8000;
				sum += 8000;
			}
			if (st[i].ft > 85 && st[i].ct > 80)
			{
				st[i].sum += 4000;
				sum += 4000;
			}
			if (st[i].ft > 90)
			{
				st[i].sum += 2000;
				sum += 2000;
			}
			if (st[i].ft > 85 && st[i].ho == 'Y')
			{
				st[i].sum += 1000;
				sum += 1000;
			}
			if (st[i].ct > 80 && st[i].po == 'Y')
			{
				st[i].sum += 850;
				sum += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (st[i].sum > j)
			{
				j = st[i].sum;
				m = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",st[m].na,st[m].sum,sum);
		st = null;
		return 0;
	}
}

