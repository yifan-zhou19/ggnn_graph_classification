public class node
{
	public int data;
	public node next;
}

package <missing>;

public class GlobalMembers
{
	public static int choose(int n, int m)
	{
		int i = 2;
		node head;
		node p1;
		node p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (node)malloc(len);
		head.data = 1;
		p1 = head;
		for (i = 2; i <= n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p2 = (node)malloc(len);
				p2.data = i;
				p1.next = p2;
				p1 = p2;
		}
		p1.next = head;
		i = 1;

		while (head.next != head)
		{
			for (i = 1; i < m; i++)
			{
				p1 = head;
				head = head.next;
			}
			p1.next = head.next;
			head = head.next;
		}
		return (head.data);
	}

	public static int Main()
	{
		int n = 1;
		int m = 1;
		int result;
		while (n != 0 && m != 0)
		{
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
			if (n == 0 && m == 0)
			{
				break;
			}
			System.out.printf("%d\n", choose(n, m));
		}
		return 0;
	}

}

