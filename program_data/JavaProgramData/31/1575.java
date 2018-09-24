public class student
{
	public String id = new String(new char[50]);
	public String name;
	public char sex;
	public short age;
	public float score;
	public String add;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student p1;
		student head;
		student p2;
		n = 0;
		head = null;
		p2 = p1 = new student();
		p1.id = new Scanner(System.in).nextLine();
		while (strcmp(p1.id,"end") != 0)
		{
			n++;
			if (n == 1)
			{
			p1.next = null;
			}
			else
			{
				p1.next = p2;
			}
			p2 = p1;
			head = p2;
			p1 = new student();
			p1.id = new Scanner(System.in).nextLine();
		}
		return head;
	}
	public static void print(student head)
	{
		student p;
		p = head;
		while (p != null)
		{
			System.out.printf("%s\n",p.id);
			p = p.next;
		}
	}
	public static int Main()
	{
		student head;
		head = creat();
		print(head);
	}


}
