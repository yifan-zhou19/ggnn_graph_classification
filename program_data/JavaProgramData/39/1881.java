public class student
{
	public String name = new String(new char[50]);
	public int mark1;
	public int mark2;
	public char gan;
	public char west;
	public int paper;
	public int money;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student head;
		student p;
		student q;
		head = new student();
		head.next = null;
		p = head;
		for (i = 0;i < n;i++)
		{
			q = new student();
			q.next = null;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q.mark1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				q.mark2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				q.gan = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				q.west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				q.paper = Integer.parseInt(tempVar7);
			}
			q.money = 0;
			if (q.mark1 > 80 && q.paper > 0)
			{
				q.money = q.money + 8000;
			}
			if (q.mark1 > 85 && q.mark2 > 80)
			{
				q.money = q.money + 4000;
			}
			if (q.mark1 > 90)
			{
				q.money = q.money + 2000;
			}
			if (q.mark1 > 85 && q.west == 'Y')
			{
				q.money = q.money + 1000;
			}
			if (q.mark2 > 80 && q.gan == 'Y')
			{
				q.money = q.money + 850;
			}
			sum = sum + q.money;
			p.next = q;
			p = q;
		}
		p = head.next;
		q = p.next;
		while (q != null)
		{
			if (p.money < q.money)
			{
				head.next = q;
			}
			q = q.next;
			p = head.next;
		}
		p = head.next;
		System.out.printf("%s\n",p.name);
		System.out.printf("%d\n",p.money);
		System.out.printf("%d\n",sum);
	}
}

