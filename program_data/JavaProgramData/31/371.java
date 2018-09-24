public class Student
{
		public String information = new String(new char[200]);
		public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static Student creat()
	{
			Student p1;
			Student p2;
			Student head;
			n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = p2 = (Student)malloc(LEN);
			p1.information = new Scanner(System.in).nextLine();
			head = null;
			while (strcmp(p1.information,"end") != 0)
			{
					n = n + 1;
					if (n == 1)
					{
							p1.next = null;
					}
					else
					{
							p1.next = p2;
					}
					p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
					p1 = (Student)malloc(LEN);
					p1.information = new Scanner(System.in).nextLine();
			}
			head = p2;
			return (head);
	}
	public static void print(Student head)
	{
			Student p;
			p = head;
			if (head != null)
			{
					do
					{
							System.out.printf("%s\n",p.information);
							p = p.next;
					} while (p != null);
			}
	}
	public static int Main()
	{
			Student head;
			head = creat();
			print(head);
			return 0;
	}

}
