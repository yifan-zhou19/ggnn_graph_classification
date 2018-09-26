public class student
{
	public String stu = new String(new char[50]);
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
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		p1.stu = new Scanner(System.in).nextLine();
		head = null;
		while (strcmp(p1.stu,"end") != 0)
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
			p1.stu = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		return (head);
	}

	public static student reverse(student head)
	{
		student p1;
		student p2;
		student p3;
		p2 = head;
		p3 = head.next;
		do
		{
			p1 = p2;
			p2 = p3;
			p3 = p2.next;
			p2.next = p1;
		}while (p3 != null);
		head.next = null;
		return (p2);
	}

	public static void print(student head)
	{
		student p;
		p = head;
		if (head != null)
		{
		while (p != null)
		{
			if (!p.stu.equals("end"))
			{
				System.out.printf("%s\n",p.stu);
			}
			p = p.next;
		}
		}
	}

	public static int Main()
	{
		student head;
		head = creat();
		head = reverse(head);
		print(head);
			return 0;
	}
}
