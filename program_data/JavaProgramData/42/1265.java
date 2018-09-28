public class num
{
	public int n;
	public num next;
}

package <missing>;

public class GlobalMembers
{
	public static int a;

	public static num creat()
	{
		num head;
		num p1;
		num p2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (num)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.n = Integer.parseInt(tempVar);
		}
		head = p1;
		for (i = 1;i < a;i++)
		{
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (num)malloc(LEN);
			p2.next = p1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.n = Integer.parseInt(tempVar2);
			}
		}
		p2 = p1;
		p2.next = null_Renamed;
		return head;
	}

	public static num del(num head, int a, int m)
	{
		num p1;
		num p2;
		int i;
		if (head == null_Renamed)
		{
			return head;
		}
		p1 = head;
		for (i = 0;i < a;i++)
		{
			if (m != p1.n && p1.next != null_Renamed)
			{
				p2 = p1;
				p1 = p1.next;
			}
			else if (m == p1.n)
			{
				//printf("%d",p1->n);
				if (p1 == head)
				{
					head = p1.next;
				}
				else
				{
					p2.next = p1.next;
				}
				p1 = p1.next;
			}
		}
		return head;
	}

	public static void print(num head)
	{
		num p;
		p = head;
		if (head != null_Renamed)
		{
			do
			{
				if (p.next == null_Renamed)
				{
					System.out.printf("%d",p.n);
				}
				else
				{
					System.out.printf("%d ",p.n);
				}
				p = p.next;
			}while (p != null_Renamed);
		}
	}

	public static void Main()
	{
		num creat = new num();
		num del = new num(struct num * head,int a,int m);
		void print(struct num * head);
		num head;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		head = creat(); //print(head);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		head = del(head, a, m);
		print(head);
	}



}

