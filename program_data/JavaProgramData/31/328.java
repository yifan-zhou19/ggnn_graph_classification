public class stu
{
	public String num = new String(new char[20]);
 public String name = new String(new char[20]);
 public char sex;
 public int age;
 public String score = new String(new char[10]);
 public String adr = new String(new char[20]);
 public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n = 0;
	int i;
		stu head;
		stu p1;
		stu p2;
		stu re;
		stu rehead;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(len);
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
			p1.adr = tempVar6.charAt(0);
		}
		head = null_Renamed;

		for (i = 0;;i++)
		{


			n++;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(len);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			if (strcmp(p1.num,"end") == 0)
			{
					break;
			}
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
				p1.adr = tempVar12.charAt(0);
			}
		}
		p2.next = null_Renamed;
	/*	p1=head;
		while(p1!=null){
				printf("%s %s %c %d %s %s\n",p1->num,p1->name,p1->sex,p1->age,p1->score,p1->adr);
				p1=p1->next;
			}*/
		for (i = 0;i < n;i++)
		{
			p2 = p1 = head;
			while (p1.next != null_Renamed)
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (i == 0)
			{
				re = rehead = p1;
			}
			else
			{
				re = re.next = p1;
			}
			p2.next = null_Renamed;
		}
			p1 = rehead;
		while (p1 != null_Renamed)
		{
				System.out.printf("%s %s %c %d %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.adr);
				p1 = p1.next;
		}

		return 0;
	}

}

