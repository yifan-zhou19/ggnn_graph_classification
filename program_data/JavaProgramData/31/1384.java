public class stu
{
	public String infor = new String(new char[50]);
	public stu previous;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu p;
		stu q;
		stu head;
		p = new stu();
		p.previous = null;
		p.infor = new Scanner(System.in).nextLine();
		while (strcmp(p.infor,"end") != 0)
		{
			q = new stu();
			q.previous = p;
			p = q;
			p.infor = new Scanner(System.in).nextLine();
		}
		head = p.previous;
		for (p = head;p != null;p = p.previous)
		{
			System.out.println(p.infor);
		}
	}
}
