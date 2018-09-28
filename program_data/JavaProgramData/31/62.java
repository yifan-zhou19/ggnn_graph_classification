public class student
{
	public String a = new String(new char[50]);
public student prev;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void print(struct student * head);
		int n = 0;
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = head = (student)malloc(len); //???????
		p1.a = new Scanner(System.in).nextLine();
		p2 = null;
		while (strcmp(p1.a,"end") != 0)
		{
			n++;
			if (n == 1)
			{
				p2 = p1;
			}
			else
			{
				p1.prev = head;
			}
			head = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			p1.a = new Scanner(System.in).nextLine();
		}
		p2.prev = null;
		print(head);
	}
	public static void print(student head)
	{
		student p;
		p = head;
		if (head != null)
		{
			do
			{
				System.out.printf("%s\n",p.a);
				p = p.prev;
			} while (p != null);
		}
	}

}
