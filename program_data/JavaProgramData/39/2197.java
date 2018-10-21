public class info
{
	public String name = new String(new char[20]);
	public float finalscore;
	public float averscore;
	public char leader;
	public char westerner;
	public int essay;
	public info next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static info setup()
	{
		int t = 0;
		info head;
		info p1;
		info p2;
		head = p2 = p1 = new info();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.finalscore = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.averscore = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.leader = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.westerner = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.essay = Integer.parseInt(tempVar6);
		}
		while (t < n)
		{
			t++;
			p1 = new info();
			p2.next = p1;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p1.finalscore = Float.parseFloat(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.averscore = Float.parseFloat(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				p1.leader = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.westerner = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.essay = Integer.parseInt(tempVar12);
			}
			p2 = p1;
		}
		return head;
	}
	public static void Main()
	{
		int max = 0;
		int total = 0;
		int t;
		int i = 0;
		info p;
		info excellent;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = setup();
		for (i = 0;i < n;i++)
		{
			t = 0;
			if (p.finalscore > 80F && p.essay > 0)
			{
				t += 8000;
			}
			if (p.finalscore > 85F && p.averscore > 80F)
			{
				t += 4000;
			}
			if (p.finalscore > 90F)
			{
				t += 2000;
			}
			if (p.westerner == 'Y' && p.finalscore > 85F)
			{
				t += 1000;
			}
			if (p.leader == 'Y' && p.averscore > 80F)
			{
				t += 850;
			}
			if (t > max)
			{
				max = t;
				excellent = p;
			}
			total += t;
			p = p.next;
		}
		System.out.printf("%s\n%ld\n%ld\n",excellent.name,max,total);
	}


}

