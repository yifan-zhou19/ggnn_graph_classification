public class Student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String add = new String(new char[20]);
	public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static Student creat()
	{
		Student head;
		Student p1;
		Student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (Student) malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		while (p1.num.charAt(0) != 'e')
		{
			n++;
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
				p1.add = tempVar6.charAt(0);
			}
			if (n == 1)
			{
				p1.next = null;
			}
			else
			{
				p1.next = p2;
				p2 = p1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (Student) malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
		}
		head = p2;
		return head;
	}
	public static void print(Student head)
	{
		Student p;
		p = head;
		if (head != null)
		{
			do
			{
				System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.add);
				p = p.next;
			}while (p != null);
		}
	}
	public static void Main()
	{
		Student head;
		head = creat();
		print(head);
	}

}

