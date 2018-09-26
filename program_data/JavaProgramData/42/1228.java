public class sz
{
	public int num;
	public sz next;
}

package <missing>;

public class GlobalMembers
{
	public static sz creat(int n)
	{
		sz head;
		sz p1;
		sz p2;
		int i;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (sz) malloc(LEN);
		for (i = 1;i <= n;i++)
		{
			if (1 == i)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (sz) malloc(LEN);
		}
		p2.next = null;

		return head;
	}

	public static void print(sz head)
	{
		sz p;
		p = head;
		do
		{
			System.out.printf("%d",p.num);
			p = p.next;
			if (p != null)
			{
				System.out.print(' ');
			}
			else
			{
				System.out.print('\n');
			}
		}while (p != null);
	}

	public static sz move(sz head, int k)
	{
		int first = 1;
		sz p1;
		sz p2;
		p1 = head;
		do
		{
			if (p1.num == k)
			{
				if (first != 0)
				{
					head = p1.next;
				}
				else
				{
					p2.next = p1.next;
				}
			}
			else
			{
				first = 0;
				p2 = p1;
			}
			p1 = p1.next;
		}while (p1 != null);
		return head;
	}

	public static void Main()
	{
		int n;
		int k;
		sz head;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		head = move(head, k);
		print(head);
	}

}

