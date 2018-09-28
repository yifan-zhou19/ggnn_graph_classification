public class student
{
	   public String stu = new String(new char[50]);
	   public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student Create()
	{
		student p;

		p = new student();
		p.stu = "0";
		p.next = null;

		return p;
	}
	public static void Insert(student head, student tmp)
	{
		student p;
		student newnode;

		p = head;
		while (p.next != null)
		{
			p = p.next;
		}
		newnode = new student();
		p.next = newnode;
		newnode.stu = tmp.stu;
		newnode.next = null;
	}
	public static void Print(student head)
	{
		if (head.next != null)
		{
			Print(head.next);
		}
		if (strcmp(head.stu,"0") != 0)
		{
			System.out.printf("%s\n",head.stu);
		}
	}

	public static int Main()
	{
		student tmp = new student();
		student head;

		head = Create();
		tmp.stu = new Scanner(System.in).nextLine();
		while (strcmp(tmp.stu,"end") != 0)
		{
			Insert(head, tmp);
			tmp.stu = new Scanner(System.in).nextLine();
		}
		Print(head);

		return 0;
	}

}
