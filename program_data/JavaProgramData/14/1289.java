public class student
{
	public int num;
	public int chn;
	public int math;
	public int ovr;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	// ????STUDENT_NUM????????�????�???? 
	//?????????ID??????????????????? 
	//??????????????????????? 
	public static int n;
	public static student creat()
	{
		int i;
		student head;
		student p1;
		student p2;
		head = new student();
		p1 = p2 = head;
		for (i = 0;i < n;i++)
		{
			p2 = p1;
			p1 = new student();
			p2.next = p1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p2.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p2.chn = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p2.math = Integer.parseInt(tempVar3);
			}
			p2.ovr = p2.chn + p2.math;
		}
		p2.next = null;
		return (head);
	}
	public static int Main()
	{
		int i;
		int no1;
		int ovr1 = 0;
		student head;
		student p1;
		student p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();
		p1 = p2 = head;
		for (i = 0;i < 3;i++)
		{
			p1 = head;
			while (p1.next != 0)
			{
				if (p1.ovr > ovr1)
				{
					ovr1 = p1.ovr;
					no1 = p1.num;
					p2 = p1;
				}
				p1 = p1.next;
			}
			System.out.printf("%d %d\n",no1,ovr1);
			p2.ovr = 0;
			ovr1 = 0;

		}
		return 0;
	}

}

