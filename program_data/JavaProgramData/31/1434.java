public class student
{
	public String information = new String(new char[200]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		int n = 0;
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		p1.information = new Scanner(System.in).nextLine();
		p1.next = null;
		p2 = p1;
			do
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (student)malloc(LEN);
				p1.information = new Scanner(System.in).nextLine();
				if (strcmp(p1.information,"end") == 0)
				{
					p1 = null;
					head = p2;
					break;
				}
				else
				{
					p1.next = p2;
					head = p1;
					p2 = p1;
				}
			} while (1 != 0);


		return (head);
	}

	public static void print(student head)
	{
		student p;
		p = head;
		if (head != null)
		{
			do
			{
				System.out.println(p.information);
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
