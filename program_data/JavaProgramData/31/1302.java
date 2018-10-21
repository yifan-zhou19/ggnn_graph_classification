public class student
{
	public String id = new String(new char[10]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[2]);
	public int age;
	public String s = new String(new char[10]);
	public String add = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		head = null;
		while (scanf("%s",p1.id) && *p1.id >= 48 && *p1.id <= 57)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.name = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.age = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.s = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.add = tempVar5.charAt(0);
			}
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
			p1 = (student)malloc(LEN);
			i++;
		}
		p2.next = null;
		return (head);
	}
	public static void turn(student head)
	{
		student p1;
		student p2;
		p2 = p1 = head;
		while (head.next != null)
		{
			while (p1.next != null)
			{
				p2 = p1;
				p1 = p1.next;
			}
			System.out.printf("%s %s %s %d %s %s\n",p1.id,p1.name,p1.sex,p1.age,p1.s,p1.add);
			p2.next = null;
			p1 = head;
		}
	System.out.printf("%s %s %s %d %s %s\n",p1.id,p1.name,p1.sex,p1.age,p1.s,p1.add);
	}
	public static void Main()
	{
		student head;
		head = creat();
		turn(head);
	}


}

