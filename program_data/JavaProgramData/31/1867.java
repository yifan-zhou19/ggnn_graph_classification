public class student
{
	public String str = new String(new char[100]);
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
		p1 = p2 = (student)malloc(LEN);
		p1.str = new Scanner(System.in).nextLine();
		p1.next = null;
		p2 = p1;
		while (strcmp(p2.str,"end") != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				head = p2;
				p1 = p2;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (student)malloc(LEN);
			p2.next = p1;
			p2.str = new Scanner(System.in).nextLine();
		}
		return (head);
	}
	public static void print(student head)
	{
		student p;
		p = head;
		if (head != null)
		{
			while (p.next != null)
			{
				System.out.println(p.str);
				p = p.next;
			}
		}
			System.out.println(p.str);
	}
	public static void Main()
	{
		student ip;
		ip = creat();
		print(ip);
	}
}
