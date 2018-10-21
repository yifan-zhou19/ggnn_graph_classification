public class student
{
			public String str = new String(new char[50]);
			public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		   student head = null;
		   student p1;
		   student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = p2 = (student)malloc(Len);
		   p1.str = new Scanner(System.in).nextLine();
		   while (strcmp(p1.str,"end") != 0)
		   {

							   if (head == null)
							   {
								   head = p1;
							   }
							   else
							   {
								   p2.next = p1;
							   }
							   p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
							   p1 = (student)malloc(Len);
							   p1.str = new Scanner(System.in).nextLine();
		   }
		   p2.next = null;
		   return (head);
	}

	public static student re(student head)
	{
		   student p1;
		   student p2;
		   student newhead = null;
		   student n;
		   do
		   {
			   p1 = head;
		   p2 = null;
		   while (p1.next != null)
		   {
			   p2 = p1,p1 = p1.next;
		   }
		   if (newhead == null)
		   {
			   newhead = p1,n = newhead.next = p2;
		   }
		   n = n.next = p2;
		   p2.next = null;
		   }while (head.next != null);
		   return (newhead);
	}


	public static void print(student head)
	{
		 student p;
		 p = head;
		 while (p != null)
		 {
			 System.out.println(p.str);
				 p = p.next;
		 }
	}
	public static void Main()
	{
		 student head;
		 head = creat();
		 head = re(head);
		 print(head);


	}

}
