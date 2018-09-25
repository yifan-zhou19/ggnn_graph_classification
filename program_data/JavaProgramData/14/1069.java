public class student
{
	public int num;
	public int yu;
	public int shu;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		int i;
		student head;
		student p1;
		student p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.yu = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.shu = Integer.parseInt(tempVar4);
		}
		head = p1;
		for (i = 1;i <= n - 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.yu = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.shu = Integer.parseInt(tempVar7);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		student head;
		student p1;
		student p2;
		head = creat();
		p1 = head;
		for (j = 1;j <= 3;j++)
		{
			p1 = p2 = head;
			for (i = 1;i <= n - j;i++)
			{
				if ((p1.yu + p1.shu) > k)
				{
				k = p1.yu + p1.shu;
				}
				p1 = p1.next;
			}
			p1 = p2 = head;
			if ((head.yu + head.shu) == k)
			{
				System.out.printf("%d %d",p1.num,p1.yu + p1.shu);
				head = head.next;
			}
			else
			{
				for (i = 1;;i++)
				{
					if ((p1.yu + p1.shu) == k)
					{
						System.out.printf("%d %d\n",p1.num,p1.yu + p1.shu);
						//printf("%d \n",p2->num);
						if ((p1.next) != null)
						{
						p2.next = p1.next;
						}
						else
						{
							p2.next = null;
						}
						k = 0;
						break;
					}
					p2 = p1;
					p1 = p1.next;
				}
			}
		}
	}

}

