public class node
{
	public String id = new String(new char[100]);
	public String name = new String(new char[100]);
	public String sex = new String(new char[2]);
	public String address = new String(new char[100]);
	public String age = new String(new char[10]);
	public String grade = new String(new char[10]);
	public node next;
}

package <missing>;

public class GlobalMembers
{
	public static node head = null;

	public static int create()
	{
		node p = new node();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.id = tempVar.charAt(0);
		}
		if (p.id.charAt(0) == 'e')
		{
			p = null;
			return 1;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p.age = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p.grade = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p.address = tempVar6.charAt(0);
		}

		p.next = head;
		head = p;
		return 0;
	}
	public static void print()
	{
		node p = head;
		node temp;
		for (;p != null;)
		{
			System.out.printf("%s %s %s %s %s %s\n",p.id,p.name,p.sex,p.age,p.grade,p.address);
			temp = p;
			p = p.next;
			temp = null;
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		for (;;)
		{
			if (create() == 1)
			{
				break;
			}
		}
		print();
	}
}

