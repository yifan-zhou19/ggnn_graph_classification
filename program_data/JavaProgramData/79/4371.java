public class monkey
{
	public int num;
	public monkey next;
}

package <missing>;

public class GlobalMembers
{
	public static monkey del(monkey head, int x)
	{
		monkey p1;
		monkey p2;
		p1 = head;
		while (x != p1.num && p1.next != null)
		{
			p2 = p1;
			p1 = p1.next;
		}
		if (x == p1.num)
		{
			if (p1 == head)
			{
			head = p1.next;
			}
			else
			{
				p2.next = p1.next;
			}
		}
		return (head);
	}

	public static void Main()
	{
		monkey del = new monkey(struct monkey * head,int x);
		monkey head;
		monkey p1;
		monkey p2;
		int i;
		int j;
		int k = 1;
		int t;
		int[] n = new int[100];
		int[] m = new int[100];
		int count = 0;
		int p;
		for (t = 0;;t++)
		{

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[t] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[t] = Integer.parseInt(tempVar2);
			}
			if (n[t] == 0)
			{
				break;
			}
		}
		p = t - 1;
		//printf("%d",p);
		for (t = 0;t <= p;t++)
		{
			count = 0;
			k = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = p2 = head = (monkey)malloc(LEN);
			p1.num = 1;
			for (i = 2;i <= n[t];i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (monkey)malloc(LEN);
				p1.num = i;
				p2.next = p1;
				p2 = p1;
			}
			p2.next = null;
			p1 = head;
			for (i = 1;;i++)
			{
				if (k == m[t])
				{
					del(head, p1.num);
					count++;
					head = del(head, p1.num);
					k = 0;
				}
				if (p1.next != null)
				{
				p1 = p1.next;
				}
				else
				{
				p1 = head;
				}
				k++;
				if (count == n[t] - 1)
				{
					break;
				}
			}
			System.out.printf("%d\n",head.num);
		}
	}

}

