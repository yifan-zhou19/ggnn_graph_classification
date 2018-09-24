public class stu
{
	public String num = new String(new char[1000]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu f()
	{
		stu head;
		stu p;
		stu q;
		p = q = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (stu)malloc(l);
		p.next = q;
		p.num = new Scanner(System.in).nextLine();
		q = p;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (stu)malloc(l);
			p.next = q;
			q = p;
			p.num = new Scanner(System.in).nextLine();
			if (p.num.charAt(0) == 'e')
			{
				break;
			}
		}
		head = p;
		return (head);
	}
	public static void y(stu head)
	{
		stu p;
		stu q;
		p = q = head;
		p = q.next;
		while (p != 0)
		{
			System.out.println(p.num);
			q = p;
			p = q.next;
		}
	}
	public static int Main()
	{
		y(f());
		return 0;
	}

}
