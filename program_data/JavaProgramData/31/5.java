public class student
{
	public String number = new String(new char[15]);
	public String name = new String(new char[20]);
	public String gender = new String(new char[3]);
	public int age;
	public float score;
	public String address = new String(new char[30]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		int i = 1;
		student head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		student p1 = (student)malloc(LEN);
		head = p1;
		head.next = null;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.gender = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.score = Float.parseFloat(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.address = tempVar6.charAt(0);
		}
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.number = tempVar7.charAt(0);
			}
			if ((i = strcmp(p1.number,"end")) == 0)
			{
				break;
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				p1.gender = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				p1.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				p1.score = Float.parseFloat(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				p1.address = tempVar12.charAt(0);
			}
			p1.next = head;
			head = p1;
		}
		return (head);
	}
	public static void print(student p)
	{
		do
		{
			System.out.printf("%s %s %s %d %g %s\n",p.number,p.name,p.gender,p.age,p.score,p.address);
			p = p.next;
		}while (p.next != null);
		System.out.printf("%s %s %s %d %g %s\n",p.number,p.name,p.gender,p.age,p.score,p.address);
	}
	public static void Main()
	{
		student p = creat();
		print(p);
	}
}

