public class student
{
	public String str = new String(new char[1000]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student create()
	{
		student head;
		student p1;
		student p;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = (student)malloc(len);
		 p1.str = new Scanner(System.in).nextLine();
		p1.next = null;
		p2 = p1;
		while (strcmp(p1.str,"end") != 0)
		{
			p = head;
			head = p1;
			head.next = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			p1.str = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		return (head);
	}

	public static void print(student head)
	{
		student p1;
		p1 = head;
		if (head != 0)
		{
			do
			{
				System.out.println(p1.str);
				p1 = p1.next;
			}while (p1 != 0);
		}
	}

	public static void Main()
	{
		student head;
		head = create();
		print(head);
	}






}
