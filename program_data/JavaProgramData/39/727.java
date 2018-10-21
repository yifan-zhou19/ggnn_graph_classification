public class stu
{
   public String x = new String(new char[20]);
   public int a;
   public int b;
   public String c = new String(new char[2]);
   public String d = new String(new char[2]);
   public int e;
   public int t;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		stu[] h = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,m = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i].x = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				h[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				h[i].c = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				h[i].d = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				h[i].e = Integer.parseInt(tempVar7);
			}
			if (h[i].a > 80 && h[i].e >= 1)
			{
				h[i].t += 8000;
			}
			if (h[i].a > 85 && h[i].b > 80)
			{
				h[i].t += 4000;
			}
			if (h[i].a > 90)
			{
				h[i].t += 2000;
			}
			if (h[i].a > 85 && strcmp(h[i].d,"Y") == 0)
			{
				h[i].t += 1000;
			}
			if (h[i].b > 80 && strcmp(h[i].c,"Y") == 0)
			{
				h[i].t += 850;
			}
			m += h[i].t;
		}
		for (i = 0;i <= (n - 1);i++)
		{
			if (h[i].t >= h[i + 1].t)
			{
				h[i + 1] = h[i];
			}
		}
		System.out.printf("%s\n%d\n%d",h[n - 1].x,h[n - 1].t,m);
	}
}

