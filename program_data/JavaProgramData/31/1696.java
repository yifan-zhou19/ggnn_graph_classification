public class Student
{
	public String stu = new String(new char[100]);
	public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student p;
		Student head;
		Student p1;
		Student p2;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = p1 = (Student)malloc(Len);
		head = null;
		p1.stu = new Scanner(System.in).nextLine();
		while (strcmp(p1.stu,"end") != 0)
		{
			n++;
			head = p1;
			if (n == 1)
			{
				p1.next = null;
			}
			else
			{
				p1.next = p2;
				p2 = p1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (Student)malloc(Len);
				p1.stu = new Scanner(System.in).nextLine();
		}

		p = head;
		if (head != null)
		{
			do
			{
				System.out.println(p.stu);
				p = p.next;
			}while (p != null);
		}

		return 0;
	}

}
