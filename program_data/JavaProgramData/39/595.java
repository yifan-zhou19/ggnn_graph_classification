package <missing>;

public class GlobalMembers
{
	public static int sch(int e,int test,char mon,char reg,int art)
	{
		int total = 0;
		if (e > 80 && art >= 1)
		{
			total += 8000;
		}
		if (e > 85 && test > 80)
		{
			total += 4000;
		}
		if (e > 90)
		{
			total += 2000;
		}
		if (e > 85 && reg == 'Y')
		{
			total += 1000;
		}
		if (test > 80 && mon == 'Y')
		{
			total += 850;
		}
		return total;
	}
	public static int Main()
	{
		int peoplenumber;
		int i;
		int g;
		int c;
		int a;
		int sum = 0;
		int most = 0;
		String name = new String(new char[100]);
		String top = new String(new char[100]);
		char m;
		char r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			peoplenumber = Integer.parseInt(tempVar);
		}
		for (i = 0;i < peoplenumber;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				g = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				m = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				r = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a = Integer.parseInt(tempVar7);
			}
			if (sch(g, c, m, r, a) > most)
			{
				top = name;
				most = sch(g, c, m, r, a);
			}
			sum += sch(g, c, m, r, a);
		}
		System.out.printf("%s\n%d\n%d",top,most,sum);
		//scanf("%d %d %c %c %d",&g,&c,&m,&r,&a);
		//printf("%d",sch(g,c,m,r,a));

		return 0;
	}

}

