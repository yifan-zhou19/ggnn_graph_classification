public class stu_imformation
{
public String num = new String(new char[16]);
public String name = new String(new char[20]);
public char sex;
public int age;
public String score = new String(new char[10]);
public String site = new String(new char[20]);
public stu_imformation next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	stu_imformation head;
	stu_imformation p1;
	stu_imformation p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	head = (stu_imformation)malloc(LEN);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		head.num = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		head.name = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar3 != null)
	{
		head.sex = tempVar3.charAt(0);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		head.age = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		head.score = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		head.site = tempVar6.charAt(0);
	}
	p2 = head;
	head.next = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (stu_imformation)malloc(LEN);
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		p1.num = tempVar7.charAt(0);
	}
	while (strcmp(p1.num,"end"))
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
		p1.site = tempVar12.charAt(0);
	}
	p1.next = p2;
	head = p1;
	p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (stu_imformation)malloc(LEN);
	String tempVar13 = ConsoleInput.scanfRead();
	if (tempVar13 != null)
	{
		p1.num = tempVar13.charAt(0);
	}
	}
	p1 = head;
	while (p1 != null)
	{
	System.out.printf("%s %s %c %d %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.site);
	p1 = p1.next;
	}
	}
}

