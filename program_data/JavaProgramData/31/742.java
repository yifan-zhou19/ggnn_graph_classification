public class Student
{
	public String inf = new String(new char[81]);
	public Student front;
	public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static Student creat()
	{
		Student head;
		Student p1;
		Student p2;
		Student temp;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (Student)malloc(LEN);
		p1.inf = new Scanner(System.in).nextLine();
		head = null;
		while (strcmp(p1.inf,"end") != 0)
		{
			n++;
			if (n == 1)
			{
				head = p1;
				p1.front = null;
			}
			else
			{
				p2.next = p1;
				p1.front = temp;
			}
			p2 = p1;
			temp = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (Student)malloc(LEN);
			p1.inf = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		return (p2);
	}

	public static int Main()
	{
		Student pt;
		pt = creat();
		if (pt != null)
		{
			do
			{
				System.out.println(pt.inf);
				pt = pt.front;
			} while (pt != null);
		}
		return 0;
	}
}
