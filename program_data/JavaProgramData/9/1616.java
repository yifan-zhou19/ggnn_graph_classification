public class student
{
public String num = new String(new char[20]);
public int age;
public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static student create()
	{
		student head;
		student p1;
		student p2;
		head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(len);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.age = Integer.parseInt(tempVar3);
		}
		while (n != i - 1)
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
			p1 = (student)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.age = Integer.parseInt(tempVar5);
			}
		}
		p2.next = p1;
		p1.next = null;
		return (head);
	}
	public static void paixu(student p)
	{
		student p1;
		student p2;
	  String temp = new String(new char[20]);
		int temp2;
		for (n = 1;n < i;n++)
		{
			p2 = p;
		p1 = p.next;
		while (p1 != null)
		{
				if (p1.age >= 60 && p2.age < 60)
				{

		temp = p1.num;
					p1.num = p2.num;
					p2.num = temp;
		temp2 = p1.age;
			p1.age = p2.age;
		p2.age = temp2;
				}
				else if (p1.age > p2.age && p2.age >= 60)
				{
					temp = p1.num;
					p1.num = p2.num;
					p2.num = temp;
		temp2 = p1.age;
			p1.age = p2.age;
		p2.age = temp2;

				}
				p2 = p1;
				p1 = p1.next;
		}
		}
	}
	public static void print(student p)
	{
		while (p != null)
		{
			System.out.printf("%s",p.num);
			p = p.next;
			if (p != null)
			{
				System.out.print("\n");
			}
		}
	}
	public static void Main()
	{
		student p;
		p = create();
		paixu(p);
		print(p);
	}
}

