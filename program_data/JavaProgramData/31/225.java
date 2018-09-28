public class student
{
	public String ID = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String address = new String(new char[20]);
	public student next;
	public student before;
}

package <missing>;

public class GlobalMembers
{
	public static student create()
	{
		student head;
		student p1;
		student p2;
		student end;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.ID = tempVar.charAt(0);
		}
		if (strcmp(p1.ID,"end") == 0)
		{
			p1 = null;
			head = null;
			end = null;
		}
		else
		{
			head = p1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.sex = tempVar3.charAt(0);
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
				p1.address = tempVar6.charAt(0);
			}
			p1.next = null;
			p1.before = null;
			p2 = p1;

		do
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.before = p2;
			p1.next = null;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.ID = tempVar7.charAt(0);
			}
			if (strcmp(p1.ID,"end") == 0)
			{
				p2.next = null;
				end = p2;
				p1 = null;
				break;
			}
			else
			{
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					p1.name = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar9 != null)
				{
					p1.sex = tempVar9.charAt(0);
				}
				String tempVar10 = ConsoleInput.scanfRead(" ");
				if (tempVar10 != null)
				{
					p1.age = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead(" ");
				if (tempVar11 != null)
				{
					p1.score = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					p1.address = tempVar12.charAt(0);
				}
				p2.next = p1;
				p1.before = p2;
				p1.next = null;
				p2 = p1;
			}
		}while (1 != 0);
		}
		return (end);
	}
	public static void print(student end)
	{
		student p;
		p = end;
		while (p != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.ID,p.name,p.sex,p.age,p.score,p.address);
		p = p.before;
		}

	}
	public static int Main()
	{

		student end;
		end = create();
		print(end);
	}





}

