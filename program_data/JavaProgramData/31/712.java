public class student
{
	public String num = new String(new char[30]);
	public String name = new String(new char[30]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String add = new String(new char[30]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student p;
		student p1;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (student)malloc(LEN);
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
			p.sex = tempVar3.charAt(0);
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
			p.add = tempVar6.charAt(0);
		}
		//printf("%s %s %c %d %f %s\n",p->num,p->name,p->sex,p->age,p->score,p->add);
	//printf("%c\n",p->num[0]);
		while (true)
		{
			n++;
			if (n == 1)
			{
				p.next = null;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			//printf("%s\n",p1->num);
			if (strcmp(p1.num,"end") == 0)
			{
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
					p1.add = tempVar12.charAt(0);
				}
			}
			//printf("%s %s %c %d %f %s\n",p1->num,p1->name,p1->sex,p1->age,p1->score,p1->add);
			p1.next = p;
			p = p1;
			//printf("%d\n",n);
		}
		//printf("%d\n",n);
		while (p != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.add);
			p = p.next;
		}
		return 0;
	}




}

