public class student
{
public String name = new String(new char[35]);
public int final;
public int score;
public char leader;
public char west;
public int paper;
public int money;
public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
	student p;
	student q;
	student head;
	int n;
	int i = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	head = new student();
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		head.name = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		head.final = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		head.score = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar5 != null)
	{
		head.leader = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar6 != null)
	{
		head.west = tempVar6.charAt(0);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		head.paper = Integer.parseInt(tempVar7);
	}
	q = head;
	p = head;

	for (i = 0;i < n;i++)
	{
	q = p;
	q.money = 0;
	if ((q.final > 80) && (q.paper > 0))
	{
		q.money = q.money + 8000;
	}
	if ((q.final > 85) && (q.score > 80))
	{
		q.money = q.money + 4000;
	}
	if (q.final > 90)
	{
		q.money = q.money + 2000;
	}
	if ((q.final > 85) && (q.west == 'Y'))
	{
		q.money = q.money + 1000;
	}
	if ((q.score > 80) && (q.leader == 'Y'))
	{
		q.money = q.money + 850;
	}

	if (i < n - 1)
	{
		p = new student();
	String tempVar8 = ConsoleInput.scanfRead();
	if (tempVar8 != null)
	{
		p.name = tempVar8.charAt(0);
	}
	String tempVar9 = ConsoleInput.scanfRead(" ");
	if (tempVar9 != null)
	{
		p.final = Integer.parseInt(tempVar9);
	}
	String tempVar10 = ConsoleInput.scanfRead(" ");
	if (tempVar10 != null)
	{
		p.score = Integer.parseInt(tempVar10);
	}
	String tempVar11 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar11 != null)
	{
		p.leader = tempVar11.charAt(0);
	}
	String tempVar12 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar12 != null)
	{
		p.west = tempVar12.charAt(0);
	}
	String tempVar13 = ConsoleInput.scanfRead(" ");
	if (tempVar13 != null)
	{
		p.paper = Integer.parseInt(tempVar13);
	}
	q.next = p;
	}
	}

	q.next = null;
	return (head);
	}

	public static void Main()
	{
	student p;
	student q;
	student r;
	int sum = 0;
	int max = 0;
	p = creat();

	for (q = p;q != null;)
	{
		if (q.money > max)
		{
			max = q.money;
			r = q;
		}
	sum = sum + q.money;
	q = q.next;
	}

	System.out.printf("%s\n%d\n",r.name,r.money);
	System.out.printf("%d",sum);
	}


}

