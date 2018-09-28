//???????
public class student
{
	public String info = new String(new char[50]);
		public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student p1;
	public static student p2;
	public static int n;
	//????
	public static student creat()
	{
			student head;
			n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = p2 = (student)malloc(LEN);
			p1.info = new Scanner(System.in).nextLine();
			head = null;
			while (strcmp(p1.info,"end"))
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
				   p1.info = new Scanner(System.in).nextLine();
			}
			p2.next = null;
			return (head);
	}
	public static student turnback(student head)
	{
			student p;
			student newhead = null;
			do
			{
				   p2 = null;
				   p1 = head;
				   while (p1.next != null)
				   {
						   p2 = p1;
						   p1 = p1.next;
				   }
				   if (newhead == null)
				   {
						   newhead = p1;
						   p = newhead.next = p2;
				   }
				   p = p.next = p2;
				   p2.next = null;
			}while (head.next != null);
			return (newhead);
	}
	public static void output(student outhead)
	{
			for (p1 = outhead;p1 != null;p1 = p1.next)
			{
				   System.out.println(p1.info);
			}
	}

	public static void Main()
	{
			student head;
			head = creat();
			head = turnback(head);
			output(head);
			System.out.print("\n");
	}
}
