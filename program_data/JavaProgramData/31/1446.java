public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[21]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String address = new String(new char[21]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static student create()
	{
		student head;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(length);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		head = null_Renamed;
		while (strcmp(p1.num,"end") != 0)
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
				p1.address = tempVar6.charAt(0);
			}
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
			p1 = (student)malloc(length);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
		}
		p2.next = null_Renamed;
		return head;
	}
	public static void print(student head)
	{
		student p;
		student q;
		p = head;
		if (head != null_Renamed)
		{
			do
			{
				System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
				q = p;
				p = p.next;
				q = null;
			} while (p != null_Renamed);

		}
	}

	public static student converse(student head)
	{
		student p1;
		student p2;
		student p3;
		p1 = p2 = head;

		if (head != null_Renamed)
		{
			while (p2.next != null_Renamed)
			{
				p3 = p2.next;
				if (p2 == head)
				{
					p2.next = null_Renamed;
				}
				else
				{
					p2.next = p1;
				}
				p1 = p2;
				p2 = p3;
			}
			p2.next = p1;
			head = p2;
		}
		return head;
	}

	public static void Main()
	{

		student p = create();
		p = converse(p);
		print(p);
	}









}

