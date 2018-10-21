public class node
{
	public node back;
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char gender;
	public int age;
	public String score = new String(new char[10]);
	public String address = new String(new char[20]);
	public node next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String end = "end";
		String t = new String(new char[20]);
		node p;
		node head;
		p = new node();
		head = p;
		head.back = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p.gender = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p.address = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			t = tempVar7.charAt(0);
		}
		while (strcmp(t,end) != 0)
		{
			p.next = new node();
			p.next.back = p;
			p = p.next;
			p.num = t;
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				p.gender = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p.score = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p.address = tempVar12.charAt(0);
			}
			String tempVar13 = ConsoleInput.scanfRead();
			if (tempVar13 != null)
			{
				t = tempVar13.charAt(0);
			}
		}
		do
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.gender,p.age,p.score,p.address);
			p = p.back;
		}while (p != null);
	}
}

