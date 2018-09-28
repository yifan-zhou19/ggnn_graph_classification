public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[5]);
	public String age = new String(new char[5]);
	public String score = new String(new char[10]);
	public String address = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student head;
		student p1;
		student p2;
		student end;
		char c;
		int i1;
		int n1;
		p1 = p2 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.age = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.score = tempVar5.charAt(0);
		}
		i1 = 0;
		while ((c = System.in.read()) != '\n')
		{
			p1.address = tangible.StringFunctions.changeCharacter(p1.address, i1, c);
			i1++;
		}
		for (;i1 <= 19;i1++)
		{
			p1.address = tangible.StringFunctions.changeCharacter(p1.address, i1, '\0');
		}
		head = p1;
		n1 = 0;
		while (p1.num.charAt(0) != 'e')
		{
			n1 = n1 + 1;
			p2 = p1;
			p1 = new student();
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.num = tempVar6.charAt(0);
			}
			if (p1.num.charAt(0) == 'e')
			{
				break;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.sex = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				p1.age = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				p1.score = tempVar10.charAt(0);
			}
			i1 = 0;
			while ((c = System.in.read()) != '\n')
			{
				p1.address = tangible.StringFunctions.changeCharacter(p1.address, i1, c);
				i1++;
			}
			for (;i1 <= 19;i1++)
			{
				p1.address = tangible.StringFunctions.changeCharacter(p1.address, i1, '\0');
			}
			if (n1 == 1)
			{
				p1.next = head;
			}
			else
			{
				p1.next = p2;
			}
		}
		end = p2; //input

		p1 = end;
		i1 = 0;
		while (p1 != head)
		{
			System.out.printf("%s %s %s %s %s%s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.address);
			p1 = p1.next;
		}
		System.out.printf("%s %s %s %s %s%s",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.address);

	}
}

