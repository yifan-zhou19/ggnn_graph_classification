public class student
{
	public String str = new String(new char[100]);
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
	 student p3;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = p2 = p3 = (student)malloc(LEN);
	 p1.str = new Scanner(System.in).nextLine();
	 while (strcmp(p1.str,"end") != 0)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   p1 = (student)malloc(LEN);
	   p1.str = new Scanner(System.in).nextLine();
	   head = p1;
	   p1.next = p2;
	   p2 = p1;
	 }
	 p3.next = null;
	 return (head);
	}

	public static void print(student head)
	{
		student p;
		p = head.next;
		do
		{
			System.out.println(p.str);
			p = p.next;
		}while (p.next != 0);
			System.out.println(p.str);
	}

	public static int Main()
	{
		student head;
		head = creat();
		print(head);
	}
}
