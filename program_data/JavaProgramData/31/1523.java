public class Student
{
	public String num = new String(new char[1000]);
	public String name = new String(new char[1000]);
	public char sex;
	public int age;
	public String score = new String(new char[1000]);
	public String add = new String(new char[1000]);
	public Student next;
	public Student pre;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static Student creat()
	{
		Student head;
		Student end;
		Student p1;
		Student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (Student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		head = null;
		while (p1.num.charAt(0) != 'e')
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
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			n++;
			if (n == 1)
			{
				head = p1;
				p1.pre = null;
			}
			else
			{
				p2.next = p1;
				p1.pre = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (Student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
		}
		p2.next = null;
		end = p2;
		return end;
	}
	public static void print(Student end)
	{
		Student p;
		p = end;
		if (end != null)
		{
			do
			{
				System.out.printf("%s %s %c %d %s %s",p.num,p.name,p.sex,p.age,p.score,p.add);
				System.out.print('\n');
				p = p.pre;
			} while (p != null);
		}
	}

	public static int Main()
	{
		Student p;
		p = creat();
		print(p);
		return 0;
	}


}

