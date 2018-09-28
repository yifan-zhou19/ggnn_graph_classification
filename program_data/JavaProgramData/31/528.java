public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public float score;
	public String adr = new String(new char[15]);
	public student last;
}

package <missing>;

public class GlobalMembers
{
	public static final String str = "end";
	public static int n = 0;

	public static void print(student head)
	{
		student p;
		p = head;
		if (head != null)
		{
			do
			{
				System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.adr);
				p = p.last;
			}while (p != null);
		}
	}

	public static void Main()
	{
		student creat = new student();
		void print(struct student * head);
		student head;
		head = creat();
		print(head);
	}

	public static student creat()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		head = null;
		while (strcmp(p1.num,str) != 0)
		{
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
				p1.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.adr = tempVar6.charAt(0);
			}
			if (n == 0)
			{
				p1.last = null;
				n = 1;
			}
			else
			{
				p1.last = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
		}
		head = p2;
		return (head);
	}



}

