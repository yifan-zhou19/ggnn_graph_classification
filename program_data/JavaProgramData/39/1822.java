public class stu
{
public String name = new String(new char[20]);
public int mark1;
public int mark2;
public char gan;
public char west;
public int paper;
public int money;
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int max = 0;
	int sum = 0;
	stu head;
	stu p1;
	stu p2;
	stu p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	p1 = new stu();
	p2 = p1;
	head = p1;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p1.name = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		p1.mark1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		p1.mark2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar5 != null)
	{
		p1.gan = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar6 != null)
	{
		p1.west = tempVar6.charAt(0);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		p1.paper = Integer.parseInt(tempVar7);
	}
	p1.money = 0;
	for (i = 1;i < n;i++)
	{
	p1 = new stu();
	p2.next = p1;
	p2 = p1;
	String tempVar8 = ConsoleInput.scanfRead();
	if (tempVar8 != null)
	{
		p1.name = tempVar8.charAt(0);
	}
	String tempVar9 = ConsoleInput.scanfRead(" ");
	if (tempVar9 != null)
	{
		p1.mark1 = Integer.parseInt(tempVar9);
	}
	String tempVar10 = ConsoleInput.scanfRead(" ");
	if (tempVar10 != null)
	{
		p1.mark2 = Integer.parseInt(tempVar10);
	}
	String tempVar11 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar11 != null)
	{
		p1.gan = tempVar11.charAt(0);
	}
	String tempVar12 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar12 != null)
	{
		p1.west = tempVar12.charAt(0);
	}
	String tempVar13 = ConsoleInput.scanfRead(" ");
	if (tempVar13 != null)
	{
		p1.paper = Integer.parseInt(tempVar13);
	}
	p1.money = 0;
	}
	p2.next = null;
	for (p = head;p != null;p = p.next)
	{
	if ((p.mark1 > 80) && (p.paper >= 1))
	{
		p.money += 8000;
	}
	if ((p.mark1 > 85) && (p.mark2 > 80))
	{
		p.money += 4000;
	}
	if (p.mark1 > 90)
	{
		p.money += 2000;
	}
	if ((p.mark1 > 85) && (p.west == 'Y'))
	{
		p.money += 1000;
	}
	if ((p.mark2 > 80) && (p.gan == 'Y'))
	{
		p.money += 850;
	}
	}
	for (p = head;p != null;p = p.next)
	{
	sum += p.money;
	if (p.money > max)
	{
		max = p.money;
	}
	}
	for (p = head;p != null;p = p.next)
	{
	if (p.money == max)
	{
		System.out.printf("%s\n%d\n%d",p.name,p.money,sum);
		break;
	}
	}
	}
}

