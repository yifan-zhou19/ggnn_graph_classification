public class student
{
	public String a = new String(new char[60]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student creat = new student();
		student p;
		p = creat();
		for (;p != null;)
		{
			System.out.println(p.a);
			p = p.next;
		}
	}
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		p1.a = new Scanner(System.in).nextLine();
		for (;;)
		{
			n = n + 1;
			if (n == 1)
			{
				p2.next = null;
			}
			else
			{
				p1.next = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.a = new Scanner(System.in).nextLine();
			if (p1.a.charAt(0) == 'e')
			{
				head = p2;
		return (head);
			}
		}

	}
}
