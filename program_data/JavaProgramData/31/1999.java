public class student
{
	public String n = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static final String ex = "end";
	public static void Main()
	{
		int n = 0;
		student a = null;
		student b = null;
		student head;
		student p1;
		student p2;
		head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		p2 = null;
		p1.n = new Scanner(System.in).nextLine();
		while (strcmp(ex,p1.n) != 0)
		{
			p1.next = p2;
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.n = new Scanner(System.in).nextLine();
		}
		p1 = null;
		head = p2;
		a = head;
		while (a != null)
		{
			System.out.println(a.n);
			b = a.next;
			a = b;
		}
	}
}
