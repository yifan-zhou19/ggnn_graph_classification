public class example
{
	public String id = new String(new char[10]);
	public int age;
	public example next;
}

package <missing>;

public class GlobalMembers
{
	public static int i = 1;
	public static int d;
	public static int n;
	public static example creat(int n)
	{
		example head = null;
	example p1;
	example p2;
	while (i <= n)
	{
		p1 = new example();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.age = Integer.parseInt(tempVar2);
		}
	if (i == 1)
	{
		head = p1;
	p2 = head;
	}
	else
	{
	p2.next = p1;
	}
	p2 = p1;
	i = i + 1;
	}
	p2.next = null;
	return (head);
	}

	public static example paixu(example head)
	{
		final String temp1 = "";
		int temp2;
		example p1;
		example p2;
		p1 = p2 = head;

		for (i = 1;i < n;i++)
		{
			p1 = head;
			while (p1.next != null)
			{
			p2 = p1.next;
			if (p1.age < p2.age && ((p2.age) >= 60))
			{
				temp1 = p1.id;
			p1.id = p2.id;
			p2.id = temp1;
			temp2 = p1.age;
			p1.age = p2.age;
			p2.age = temp2;
			}
			p1 = p1.next;
			}
		}
		return head;
	}

	public static void print(example head)
	{
		example s;
	s = head;
	if (head != null)
	{
	do
	{
		System.out.printf("%s\n",s.id);
	s = s.next;
	}while (s != null);
	}
	}


	public static void Main()
	{
		example head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		head = paixu(head);
		print(head);
	}





}

