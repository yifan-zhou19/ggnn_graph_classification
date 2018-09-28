public class stu
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[10]);
	public String adr = new String(new char[15]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu student = new stu();

	public static int i;

	public static stu creat()
	{
		stu p1;
		stu p2;
		stu head;
		p1 = p2 =  new stu();
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
		head = null;
		i = 0;
		while (true)
		{
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu) malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			if (p1.num.charAt(0) == 'e')
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
			i++;
		}
		return (head);
	}
	public static void Main()
	{
	stu p;
	stu head;
		int j;
		head = creat();
		for (;i > 0;i--)
		{
			p = head;
			for (j = 0;j < i;j++)
			{
				p = p.next;
			}
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.adr);
		}
		System.out.printf("%s %s %c %d %s %s\n",head.num,head.name,head.sex,head.age,head.score,head.adr);
	}




}

