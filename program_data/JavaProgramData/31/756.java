public class Student
{
	public String id = new String(new char[200]);
	public String name = new String(new char[200]);
	public String sex = new String(new char[1]);
	public int age;
	public float mark;
	public String address = new String(new char[200]);
	public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student p;
		Student head;
		Student tail;
		head = tail = null;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (Student) malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.id = tempVar.charAt(0);
			}
			if (p.id.charAt(0) == 'e')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p.mark = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p.address = tempVar6.charAt(0);
			}
			p.next = null;
			if (head == null)
			{
				head = tail = p;
			}
			else
			{
				p.next = head;
				head = p;
			}
		}
		p = head;
		while (p != null)
		{
			System.out.printf("%s ", p.id);
			System.out.printf("%s ", p.name);
			System.out.printf("%s ", p.sex);
			System.out.printf("%d %g ", p.age, p.mark);
			System.out.printf("%s\n", p.address);
			p = p.next;
		}
		return 0;
	}
}

