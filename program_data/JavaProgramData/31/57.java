public class student
{
	public String num = new String(new char[1000]);
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
		final String a = "end";
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		p1.num = new Scanner(System.in).nextLine();
		head = null;
		while (strcmp(p1.num,a) != 0)
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
		return head;
	}
	public static void print(student head)
	{
		student p;
		p = head;
		if (head != null)
		{
			do
			{
				System.out.printf("%s\n",p.num);
				p = p.next;
			} while (p != null);
		}
	}
	public static student sort(student head)
	{
		 student p1;
		 student p2;
		 student p3;

		 p1 = head;
		 p2 = p1.next;
		 p1.next = null;
		 while (p2.next != null)
		 {
		   head = p2;
		   p3 = p2.next;
		   p2.next = p1;
		   p1 = p2;
		   p2 = p3;
		 }
		 head = p2;
		   p2.next = p1;
		   return head;

	}
	public static void Main()
	{
		student head;
		head = creat();
		head = sort(head);
		print(head);
	}
}
