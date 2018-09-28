public class student
{
	public String num = new String(new char[10]);
public String name = new String(new char[20]);
public char sex;
public int age;
public String score = new String(new char[10]);
public String adr = new String(new char[30]);
public student previous;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student end;
		student head;
	student p1;
	student p2;
	student p;
	/*p1=(struct student *)malloc(LEN);*/
	p2 = head = null;
	while (true)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p1.num = tempVar.charAt(0);
	}
	if (strcmp(p1.num,"end") == 0)
	{
		break;
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
	if (head == null)
	{
		head = p1;
	}
	else
	{
		p1.previous = p2;
	}
	p2 = p1;
	}
	/*p1->previous=p2;*/
	end = p2;
	p = end;
	if (end != null)
	{
	do
	{
		System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.adr);
	p = p.previous;
	}while (p != null);
	}
	}


}

