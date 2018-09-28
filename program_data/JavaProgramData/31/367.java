public class Student
{
	public String stu = new String(new char[500]);
	public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static void Main()
	{
		Student creat = new Student();
		void print(struct Student * head,int num);
		Student head;
		head = creat();
		int i = 0;
		for (i = n;i > 0;i--)
		{
			print(head, i);
		}
	}

	public static Student creat()
	{
		Student p1;
		Student p2;
		Student head;
		head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (Student)malloc(LEN);
		p1.stu = new Scanner(System.in).nextLine();
		while (strcmp(p1.stu,"end") != 0)
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
			p1 = (Student)malloc(LEN);
			p1.stu = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		return (head);
	}

	public static void print(Student head, int num)
	{
		Student p;
		p = head;
		int count = 1;
		while (count < num)
		{
			p = p.next;
			count += 1;
		}
		System.out.printf("%s\n",p.stu);
	}
}
