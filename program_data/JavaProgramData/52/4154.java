public class node
{
	public int num;
	public node next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int t;
		node head = null;
		node p;
		node last = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		head = new node();
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			head.num = Integer.parseInt(tempVar3);
		}
		head.next = head;
		last = head;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				t = Integer.parseInt(tempVar4);
			}
			p = new node();
			p.num = t;
			last.next = p;
			p.next = head;
			last = p;
		}
		for (i = 0;i < n - m % n;i++)
		{
			head = head.next;
		}
		System.out.printf("%d",head.num);
		for (i = 1;i < n;i++)
		{
			head = head.next;
			System.out.printf(" %d",head.num);
		}
	}

}

