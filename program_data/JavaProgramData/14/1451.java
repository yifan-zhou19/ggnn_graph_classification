public class student
{
	public int num;
public int yuwen;
public int shuxue;
public int sum;
public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static void Main()
	{
		student creat = new student();
		void shuchu(struct student * head);
		int i;
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();
		for (i = 0;i < 3;i++)
		{
			shuchu(head);
		}
	}
	public static student creat()
	{
		int i;
		int k = 0;
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(len); //???????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.yuwen = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.shuxue = Integer.parseInt(tempVar3);
		}
		p1.sum = p1.shuxue + p1.yuwen;
		head = null;
		for (i = 0;i < n;i++)
		{
			k++;
			if (k == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.yuwen = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.shuxue = Integer.parseInt(tempVar6);
			}
			p1.sum = p1.shuxue + p1.yuwen;
		}
		p2.next = null;
		return (head);
	}
	public static void shuchu(student head)
	{
		student p;
		int max;
		int i;
		p = head;
		max = p.sum;
		for (i = 0;i < n;i++)
		{
			if (p.sum > max)
			{
				max = p.sum;
			}
			p = p.next;
		}
			p = head;
			for (i = 0;i < n;i++)
			{
				if (p.sum == max)
				{
					System.out.printf("%ld %d\n",p.num,p.sum);
					p.sum = 0;
					break;
				}
				p = p.next;
			}
	}
}

