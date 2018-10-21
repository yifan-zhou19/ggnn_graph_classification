public class student
{
	public String message = new String(new char[300]);
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
	p1.message = new Scanner(System.in).nextLine();
	head = null;
	while (strcmp(p1.message,"end") != 0)
	{
		n = n + 1;
		if (n == 1)
		{
			head = p1;
		}
		else
		{
			p1.next = p2;
		}
		p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		p1.message = new Scanner(System.in).nextLine();
	}
	head.next = null;
	return (p2);
	}
	public static void print(student head)
	{
		student p;
		p = head;
		if (head != null)
		{
			do
			{
				System.out.printf("%s\n",p.message);
				p = p.next;
			} while (p != null);
		}
	}



		 public static void Main()
		 {
			 student head;
	head = creat();
	print(head);
		 }
}
