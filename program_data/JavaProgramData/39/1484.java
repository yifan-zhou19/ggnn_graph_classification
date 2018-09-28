public class person
{
	public String pname = new String(new char[30]);
	public int s1;
	public int s2;
	public int s3;
	public char c1;
	public char c2;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		person[] p = tangible.Arrays.initializeWithDefaultpersonInstances(100);
		int n;
		int m;
		int i;
		int j;
		int k;
		int tot;
		for (i = 0;i < 100;i++)
		{
			p[i].s1 = 0;
			p[i].s2 = 0;
			p[i].s3 = 0;
			p[i].money = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		tot = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].pname = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].s1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].s2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p[i].c1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p[i].c2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p[i].s3 = Integer.parseInt(tempVar7);
			}
			if (p[i].s1 > 80 && p[i].s3 >= 1)
			{
				p[i].money += 8000;
			}
			if (p[i].s1 > 85 && p[i].s2 > 80)
			{
				p[i].money += 4000;
			}
			if (p[i].s1 > 90)
			{
				p[i].money += 2000;
			}
			if (p[i].s1 > 85 && p[i].c2 == 'Y')
			{
				p[i].money += 1000;
			}
			if (p[i].s2 > 80 && p[i].c1 == 'Y')
			{
				p[i].money += 850;
			}
			tot += p[i].money;
			if (p[i].money > p[k].money)
			{
				k = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",p[k].pname,p[k].money,tot);
		return 0;
	}

}

