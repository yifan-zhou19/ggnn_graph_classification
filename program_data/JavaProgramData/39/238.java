public class xinxi
{
	public String ming = new String(new char[22]);
	public int qimo;
	public int pingyi;
	public char guan;
	public char xibu;
	public int lunwen;
   public int award;
   public xinxi next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		xinxi head;
		xinxi pt;
		xinxi p;
		xinxi x;
		int i;
		int n;
		int t;
		int awardmax;
		int awardsum;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}


		p = new xinxi();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p.ming = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p.qimo = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p.pingyi = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p.guan = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p.xibu = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p.lunwen = Integer.parseInt(tempVar7);
		}

		pt = p;
		head = null;
		t = 1;
		while (t < n)
		{
			if (t == 1)
			{
				head = p;
			}
			if (t > 1)
			{
				pt.next = p;
			}

			pt = p;
			p = new xinxi();


			t = t + 1;
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p.ming = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p.qimo = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p.pingyi = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p.guan = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar12 != null)
			{
				p.xibu = tempVar12.charAt(0);
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				p.lunwen = Integer.parseInt(tempVar13);
			}

		}

		pt.next = p;
		p.next = null;


		x = head;
	while (x != null)
	{
			x.award = 0;
			if (x.qimo > 80 && x.lunwen != 0)
			{
				x.award = x.award + 8000;
			}
			if (x.qimo > 85 && x.pingyi > 80)
			{
				x.award = x.award + 4000;
			}
			if (x.qimo > 90)
			{
				x.award = x.award + 2000;
			}
			if (x.qimo > 85 && x.xibu == 'Y')
			{
				x.award = x.award + 1000;
			}
			if (x.pingyi > 80 && x.guan == 'Y')
			{
				x.award = x.award + 850;
			}

			x = x.next;

	}
	awardsum = 0;
	awardmax = 0;
	x = head;

	while (x != null)
	{
		awardsum = x.award + awardsum;

	if (x.award > awardmax)
	{
		awardmax = x.award;
	}
		x = x.next;
	}

	for (x = head;x.award != awardmax;x = x.next)
	{
		;
	}
	System.out.printf("%s\n",x.ming);
	System.out.printf("%d\n",x.award);
	System.out.printf("%d",awardsum);
	}

}

