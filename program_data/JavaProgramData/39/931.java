public class member
{
	public String name = new String(new char[100]);
	public int a;
	public int b;
	public char O;
	public char W;
	public int x;
}

package <missing>;

public class GlobalMembers
{
	public static int money(member p)
	{
		int m = 0;
		if (p.a > 80 && p.x >= 1)
		{
			m += 8000;
		}
		if (p.a > 85 && p.b > 80)
		{
			m += 4000;
		}
		if (p.a > 90)
		{
			m += 2000;
		}
		if (p.a > 85 && p.W == 'Y')
		{
			m += 1000;
		}
		if (p.b > 80 && p.O == 'Y')
		{
			m += 850;
		}
		return m;
	}
	public static int Main()
	{
		member[] p = tangible.Arrays.initializeWithDefaultmemberInstances(100);
		int N;
		int i;
		int[] m = new int[100];
		int max = 0;
		int co;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p[i].O = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p[i].W = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p[i].x = Integer.parseInt(tempVar7);
			}
			m[i] = money(p[i]);
		}
		for (i = 0;i < N;i++)
		{
			if (m[i] > max)
			{
			max = m[i];
			co = i;
			}
		}
		int sum = 0;
		for (i = 0;i < N;i++)
		{
			sum += m[i];
		}
		System.out.printf("%s\n%d\n%d\n",p[co].name,m[co],sum);
	}
}

