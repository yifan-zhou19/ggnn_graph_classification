public class student
{
	public String id = new String(new char[20]);
	public String name = new String(new char[30]);
	public char sex;
	public int age;
	public String score = new String(new char[30]);
	public String add = new String(new char[30]);
	public student next;
	public student adv;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static void Main()
	{
		student p;
		student q;
		student head;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = q = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			(p).sex = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			(p).age = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p.add = tempVar6.charAt(0);
		}
		head = null;
		while (strcmp(p.id,"end") != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				p.adv = null;
				head = p;
			}
			else
			{
				q.next = p;
			}
			p.adv = q;
			q = p;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p.id = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				p.sex = tempVar9.charAt(0);
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
				p.add = tempVar12.charAt(0);
			}

		}
		q.next = null;
		while (q != null)
		{
			if (q != head)
			{
				System.out.printf("%s %s %c %d %s %s\n",q.id,q.name,(q).sex,(q).age,q.score,q.add);
			q = q.adv;
			}
			else
			{
				System.out.printf("%s %s %c %d %s %s\n",head.id,head.name,(head).sex,(head).age,head.score,head.add);
				break;
			}
		}
	}






}

