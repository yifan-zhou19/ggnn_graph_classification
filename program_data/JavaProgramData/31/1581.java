public class student
{
	public String infor = new String(new char[100]);
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
			 int n;
			 final String l = "end";
			 n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = p2 = (student)malloc(LEN);
		  p1.infor = new Scanner(System.in).nextLine();
		   head = null;
		   while (strcmp(p1.infor,l) != 0)
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
				p1.infor = new Scanner(System.in).nextLine();
		   }
			   p2.next = null;
			return (head);
	}
	public static void print(student head)
	{
		student p;
		student p1;
		student p2;
		p = p1 = p2 = head;
		p2 = p.next;
		p1 = p2.next;
		head.next = null;
		for (;p1.next != null;)
		{
		p2.next = p;
		p = p2;
		p2 = p1;
		p1 = p1.next;
		}
		p2.next = p;
		p1.next = p2;
		head = p1;
		p = head;
		for (;p != null;)
		{
			System.out.printf("%s\n",p.infor);
		  p = p.next;
		}
	}
	public static void Main()
	{
		student head;
		head = creat();
		print(head);
	}
}
