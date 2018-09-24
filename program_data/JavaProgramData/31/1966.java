public class stu
{
	public String info = new String(new char[1000]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu head;
	public static stu create()
	{

		final String str1 = "end";
		stu p1;
		stu p2;
		stu p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(Len);
		p1.info = new Scanner(System.in).nextLine();
		p1.next = null;
		if (strcmp(p1.info,str1) == 0)
		{
			p1 = null;
			head = null;
			return head;
		}
		else
		{
			head = p1;
			p2 = p1;
			do
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (stu)malloc(Len);
				p1.info = new Scanner(System.in).nextLine();
				p = head;

				if (strcmp(p1.info,str1) == 0)
				{
					p1 = null;
					break;
				}
				else
				{

					p1.next = p2;
					head = p1;
					p2 = p1;

				}
			}while (1 != 0);
				return head;
		}
	}

	public static void print(stu head)
	{
		stu p;
		p = head;
		if (head != null)
		{
			do
			{
				System.out.println(p.info);

				p = p.next;
			}while (p != null);
		}
	}
	public static void Main()
	{

		create();

		print(head);
	}
}
