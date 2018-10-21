public class stu
{
	public String num = new String(new char[1000]);
	public stu pre;
}

package <missing>;

public class GlobalMembers
{
	public static stu phead;
	public static stu p1;
	public static stu p2;
	public static stu pend;
	public static void print()
	{
		stu p;
		for (p = pend;p != phead;)
		{
			System.out.println(p.num);
			p = p.pre;
		}
		System.out.println(p.num);
	}

	public static int Main()
	{
		for (p1 = p2 = phead = new stu();;)
		{
			p1.num = new Scanner(System.in).nextLine();
			if (p1.num.charAt(0) == 'e')
			{
				pend = p1.pre;
				break;
			}
			p1 = new stu();
			p1.pre = p2;
			p2 = p1;
		}
		print();
	}
}
