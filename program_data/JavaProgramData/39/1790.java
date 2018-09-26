public class stu
{
	public String name = new String(new char[20]);
	public int chengji;
	public int pingyi;
	public String ganbu = new String(new char[1]);
	public String xibu = new String(new char[1]);
	public int lunwen;
	public int scholarship;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu creat()
	{
		int i;
		int n;
		stu head;
		stu p1;
		stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(LEN);
		head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.chengji = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.pingyi = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.lunwen = Integer.parseInt(tempVar7);
			}
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2 = p1;
			}
			if (i != (n - 1))
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = p2.next = (stu)malloc(LEN);
			}
			else
			{
				p2.next = null;
			}
		}
		return (head);
	}
	public static stu px(stu head)
	{
		stu p1;
		stu p2;
		stu p3;
		stu p4;
		int k;
		int add = 0;
		int max = 0;
		for (p2 = head;p2 != null;p2 = p2.next)
		{
			p2.scholarship = 0;
		}
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			if ((p1.chengji > 80) && (p1.lunwen >= 1))
			{
				p1.scholarship = p1.scholarship + 8000;
			}
			if ((p1.chengji > 85) && (p1.pingyi > 80))
			{
				p1.scholarship = p1.scholarship + 4000;
			}
			if (p1.chengji > 90)
			{
				p1.scholarship = p1.scholarship + 2000;
			}
			if ((p1.chengji > 85) && (p1.xibu.charAt(0) == 'Y'))
			{
				p1.scholarship = p1.scholarship + 1000;
			}
			if ((p1.pingyi > 80) && (p1.ganbu.charAt(0) == 'Y'))
			{
				p1.scholarship = p1.scholarship + 850;
			}
		}
		for (p3 = head;p3 != null;p3 = p3.next)
		{
			k = 0;
			for (p4 = head;p4 != null;p4 = p4.next)
			{
				if (p3.scholarship < p4.scholarship)
				{
					k++;
				}
			}
			if (k == 0)
			{
				System.out.printf("%s\n%d\n",p3.name,p3.scholarship);
				break;
			}
		}
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			add = add + p1.scholarship;
		}
		System.out.printf("%d\n",add);
		return head;
	}
	public static void Main()
	{
		stu a;
		stu b;
		a = creat();
		b = px(a);
	}
}

