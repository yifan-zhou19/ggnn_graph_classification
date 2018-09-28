public class student
{
	public String num = new String(new char[1000]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		p1.num = new Scanner(System.in).nextLine();
		while (strcmp(p1.num,"end") != 0)
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
			p1.num = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		return (head);
	}
	public static student reverse(student head)
	{
		student s;
		student s1;
		s = head;
		head = null;
		while (s != null)
		{
			s1 = s;
			s = s.next;
			s1.next = head;
			head = s1;
		}
		return (head);
	}
	public static void print(student head)
	{
		student p;
		p = head;
		while (p != null)
		{
				System.out.printf("%s\n",p.num);
				p = p.next;
		}
	}
	public static void Main()
	{
		student head;
		head = creat();
		head = reverse(head);
		print(head);
	}

}
