public class Info
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[10]);
	public String address = new String(new char[20]);
	public Info next;
	public Info former;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Info head;
		Info p1;
		Info p2;
		Info p;
		Info tail;
		head = new Info();
		p1 = head;
		p2 = head;
		String temp = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p2.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p2.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p2.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p2.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p2.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p2.address = tempVar6.charAt(0);
		}
		head.former = null;
		head.next = null;
		p2 = new Info();
		while (true)
		{
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				temp = tempVar7.charAt(0);
			}
			if (strcmp(temp,"end") != 0)
			{
				p2.num = temp;
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					p2.name = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar9 != null)
				{
					p2.sex = tempVar9.charAt(0);
				}
				String tempVar10 = ConsoleInput.scanfRead(" ");
				if (tempVar10 != null)
				{
					p2.age = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead(" ");
				if (tempVar11 != null)
				{
					p2.score = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					p2.address = tempVar12.charAt(0);
				}
				p2.former = p1;
				p2.next = null;
				p1.next = p2;
				p1 = p2;
				p2 = new Info();
			}
			else
			{
					tail = p1;
					break;
			}
		}
		p = tail;
		do
		{
			if ((p.score - (int)p.score) != 0)
			{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
			}
			else
			{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
			}
			p = p.former;
		} while (p != null);
		return 0;
	}
}

