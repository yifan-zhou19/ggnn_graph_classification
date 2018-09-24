public class student //?????????????????
{
	public String num = new String(new char[100]);
	public String name = new String(new char[100]);
	public char gender;
	public int age;
	public float grade;
	public String address = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student p1;
	public static student p2;

	public static student creat() //????????
	{
		int n;
		student head;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN); //???????*????????????????
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
			p1.gender = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.grade = Float.parseFloat(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.address = tempVar6.charAt(0);
		}
		head = null;
		while (strcmp(p1.num,"end") != 0) //????
		{
			n = n + 1;
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
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			if (strcmp(p1.num,"end") != 0)
			{
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				p1.gender = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p1.grade = Float.parseFloat(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.address = tempVar12.charAt(0);
			}
			}
		}
		p2.next = null;
		return (head);
	}
	public static void print(student head) //????
	{
		student p1;
		for (p1 = head; p1 != null; System.out.printf("%s %s %c %d %g %s\n",p1.num,p1.name,p1.gender,p1.age,p1.grade,p1.address),p1 = p1.next)
		{
			;
		}
	}

	//?????
	public static student turnback(student head)
	{
		student new;
		student newhead = null;
		do
		{
			p2 = null;
			p1 = head;
			while (p1.next != null)
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (newhead == null)
			{
				newhead = p1,new = newhead.next = p2;
			}
			else
			{
				new = new.next = p2;
			}
			p2.next = null;
		} while (head.next != null);
		return (newhead);
	}
	public static void Main()
	{
		student head;
		head = creat();
		head = turnback(head);
		print(head);
	}

}

