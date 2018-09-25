public class stu
{
	public int num;
	public int ch;
	public int mt;
	public int sum;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu p1;
		stu p2;
		stu p;
		stu head;
		int n;
		int max = 0;
		int max2 = 0;
		int max3 = 0;
		int no = 0;
		int no2 = 0;
		int no3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.ch = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.mt = Integer.parseInt(tempVar4);
		}
		p1.sum = p1.ch + p1.mt;
		head = p1;
		p2 = p1;

		while (n - 1 != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.ch = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.mt = Integer.parseInt(tempVar7);
			}
			p1.sum = p1.ch + p1.mt;
			p2.next = p1;
			p2 = p1;
			//printf("%d %d %d\n",p1->num,p1->ch,p1->mt,p1->sum);
			n--;
		}
		p2.next = null;

		p = head;
		while (p != null)
		{
			if (p.sum > max)
			{
				max = p.sum;
				no = p.num;
			}
			p = p.next;
		}
		System.out.printf("%d %d\n",no,max);

		p = head;
		while (p != null)
		{
			if (p.sum > max2 && p.sum <= max != 0 && p.num != no)
			{
				max2 = p.sum;
				no2 = p.num;
			}
			p = p.next;
		}
		System.out.printf("%d %d\n",no2,max2);

		p = head;
		while (p != null)
		{
			if (p.sum > max3 && p.sum <= max2 != 0 && p.num != no2 && p.num != no)
			{
				max3 = p.sum;
				no3 = p.num;
			}
			p = p.next;
		}
		System.out.printf("%d %d\n",no3,max3);
	}
}

