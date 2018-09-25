public class student
{
	public int num;
	public int score1;
	public int score2;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int m)
	{
		int i = 0;
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.score1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.score2 = Integer.parseInt(tempVar3);
		}
		p1.sum = (p1.score1) + (p1.score2);
		head = null;
		while (p1.num < m)
		{
			i++;
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score1 = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.score2 = Integer.parseInt(tempVar6);
			}
			p1.sum = (p1.score1) + (p1.score2);
		}
		p2.next = null;
		return (head);
	}
	public static void print(student head)
	{
		student p = head;
		student q = head;
		int a = 0;
		int b = 0;
		int c = 0;
		if (head != null)

		{
			do
			{
				if (a < p.sum)
				{
					a = p.sum;
					q = p;
				}
				p = p.next;
			}while (p != null);
			System.out.printf("%d %d\n",q.num,q.sum);
			q.sum = 0;
			p = head;
			q = head;
		 do
		 {
			  if (b < p.sum)
			  {
					b = p.sum;
					q = p;
			  }
				p = p.next;
		 }while (p != null);
			System.out.printf("%d %d\n",q.num,q.sum);
			q.sum = 0;
			p = head;
			q = head;
			do
			{
				if (c < p.sum)
				{
					c = p.sum;
					q = p;
				}
				p = p.next;
			}while (p != null);
		System.out.printf("%d %d",q.num,q.sum);
		}
	}
	public static void Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		student head;
		student stu = new student();
		head = creat(m);
		print(head);
	}

}

