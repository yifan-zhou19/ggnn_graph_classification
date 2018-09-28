public class student
{
	public String number = new String(new char[40]);
	public String name = new String(new char[50]);
	public char sex;
	public int age;
	public float score;
	public String address = new String(new char[50]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(Len);
		head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.number = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			(p1.sex) = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(p1.age) = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			(p1.score) = Float.parseFloat(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.address = tempVar6.charAt(0);
		}
		n = 0;
		while (true)
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
			p1 = (student)malloc(Len);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.number = tempVar7.charAt(0);
			}
			if (*p1.number == 'e')
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
				(p1.sex) = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				(p1.age) = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				(p1.score) = Float.parseFloat(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				p1.address = tempVar12.charAt(0);
			}
		}
		p2.next = null;
		return (head);
	}
	public static student reverse(student head)
	{
		student p1;
		student p2;
		student p3;
		p1 = head;
		p2 = p1;
		p3 = p1;
		do
		{
			if (p3 == head)
			{
				p3 = p2.next;
				p2 = p3;
				p1.next = null;
			}
			else
			{
				p3 = p2.next;
				p2.next = p1;
				p1 = p2;
				p2 = p3;
			}
		}while (p3 != null);
		head = p1;
		return (head);
	}
	public static int Main()
	{
		student head;
		head = creat();
		head = reverse(head);
		student p1;
		p1 = head;
		while (p1 != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p1.number,p1.name,p1.sex,p1.age,p1.score,p1.address);
			p1 = p1.next;
		}
		return 0;
	}
}

