public class student
{
	public student next;
	public String a = new String(new char[100]);
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student p1;
		student p2;
		student head;
		n = 0;
		p1 = new student();
		p1.a = new Scanner(System.in).nextLine();
		p2 = p1;
		head = null;
		while (strcmp(p1.a,"end") != 0)
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
			p1 = new student();
			p1.a = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		return (head);
	}
	/*void main()
	{
		struct student *p,*head;
		head=creat();
		p=head;
		while(p!=NULL)
		{
			printf("%s\n",p->a);
			p=p->next;
		}
	
	}*/
	public static void Main()
	{
		student p1;
		student head;
		student p2;
		head = creat();
		p1 = head;

		while (true)
		{

			if (p1.next != null)
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (p1.next == null && p2 != head)
			{

				System.out.printf("%s\n",p1.a);
				p2.next = null;
				p1 = head;
			}
			if (p1.next == null && p2 == head)
			{
				break;
			}


		}
		System.out.printf("%s\n%s",p1.a,head.a);
	}


}
