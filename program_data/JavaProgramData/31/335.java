public class stu
{
	public String inf = new String(new char[50]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu head;
	public static stu p1;
	public static stu p2;
	public static int output(stu point)
	{
		if (strcmp(point.next.inf,"end") != 0)
		{
			output(point.next);
		}
		System.out.println(point.inf);
		return 0;
	}
	public static int Main()
	{

		p1 = new stu();
		head = p1;
		while (gets(p1.inf) != null)
		{
			p2 = new stu();
			p1.next = p2;
			p1 = p2;
		}
		p1.next = null;
		output(head);
		return 0;
	}
}
