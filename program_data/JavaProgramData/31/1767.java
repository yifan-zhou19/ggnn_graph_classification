public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public char c;
	public int age;
	public String score = new String(new char[10]);
	public String addr = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1;
		student p2;
		student p;
		student head;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.c = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.addr = tempVar6.charAt(0);
		}
		p1.next = null;
		do
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p2.num = tempVar7.charAt(0);
			}
			if (strcmp(p2.num,"end") == 0)
			{
				head = p1;
				break;
			}
			else
			{
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p2.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				p2.c = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p2.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				p2.score = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				p2.addr = tempVar12.charAt(0);
			}
			p2.next = p1;
			p1 = p2;
			}
		}while (strcmp(p2.num,"end") != 0);

		p = head;
		do
		{
			if (p.next == null)
			{
				break;
			}
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.c,p.age,p.score,p.addr);
			if (p.next != null)
			{
				p = p.next;
			}
		}while (p.next != null);
		System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.c,p.age,p.score,p.addr);

	}

}

